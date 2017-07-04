var viewTags = $('.bit-view'),
    newTags = $('.bit-new'),
    fiNo = $('#fi-no'),
    fiEmail = $('#fi-email'),
    fiName = $('#fi-name'),
    fiTel = $('#fi-tel'),
    fiHomepage = $('#fi-homepage'),
    fiFacebook = $('#fi-facebook'),
    fiTwitter = $('#fi-twitter'),
    fiPassword = $('#fi-password');

var no = 0

try{
  no = location.href.split('?')[1].split('=')[1]
} catch (err) {} // 에러가 떠도 안멈추고 아래로 내려감

if (no == 0) { // 새 학생 등록
  viewTags.css('display', 'none')

  $('#add-btn').click(function() {
    $.post('add.json', {
      email: fiEmail.val(),
      name: fiName.val(),
      tel: fiTel.val(),
      homepage: fiHomepage.val(),
      facebook: fiFacebook.val(),
      twitter: fiTwitter.val(),
      password: fiPassword.val()

    }, function(result) {
      location.href = 'index.html'
    }, 'json')
  })
} else { // 학생 정보 조회
  newTags.css('display', 'none')
  $.getJSON('detail.json', {no: no}, function(result) {
	var data = result.data
    fiNo.text(data.no)
    fiEmail.val(data.email)
    fiName.val(data.name)
    fiTel.val(data.tel)
    fiHomepage.val(data.homepage)
    fiFacebook.val(data.facebook)
    fiTwitter.val(data.twitter)
  })
  
$('#upd-btn').click(function() {
  $.post('update.json', {
    no: fiNo.text(),
    email: fiEmail.val(),
    name: fiName.val(),
    tel: fiTel.val(),
    homepage: fiHomepage.val(),
    facebook: fiFacebook.val(),
    twitter: fiTwitter.val(),
    password: fiPassword.val()

  }, function(result) {
    location.href = 'index.html'
  }, 'json')
})

$('#del-btn').click(function() {
  $.getJSON('delete.json', {no: no}, function(result) {
    location.href = 'index.html'
  })
})
}













//

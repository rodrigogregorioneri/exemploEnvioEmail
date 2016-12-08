

app.userEvents.testeButton631192NgClick = function(event) {
    var request = { echoServer:  'OK' };
  
    $.ajax({
      dataType: "json",
      method: "POST",
      url: "api/rest/events/TesteEventREST/testebutton631192ngclick",
      data: JSON.stringify(request),
      headers: {
        'Content-Type' : 'application/json'
      },
      success: function(data) {
        
        this.$apply(function() {
        
        

        
        
        
          
        }.bind(this));
        
      }.bind(this)
    });
}
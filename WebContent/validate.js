function validate() {
	
		 if( document.myForm.playerId.value == "" ) {
			 alert( "Please provide your Id!" );
		     document.myForm.playerId.focus() ;
		     return false;
		 }
		 if( isNaN( document.myForm.playerId.value)) {
			 alert( "Please provide your Id In Numbers!" );
		     document.myForm.playerId.focus() ;
		     return false;
		 }
		 if( document.myForm.playerId.value.length > 10) { 
	        alert( "Id Length Should be Less Than 10!" );
	        document.myForm.playerId.focus() ;
	        return false;
	     }
         if( document.myForm.playerName.value == "" ) {
            alert( "Please provide your name!" );
            document.myForm.playerName.focus() ;
            return false;
         }
         if( document.myForm.age.value == "") {
            alert( "Please provide your Age!" );
            document.myForm.age.focus() ;
            return false;
         }
         if(isNaN( document.myForm.age.value )) {
        	alert( "Please provide your Age In Numbers!" );
		    document.myForm.age.focus() ;
		    return false;
        }
         if( document.myForm.age.value <18 ) { 
 	        alert( "Age Should be greater Than 17!" );
 	        document.myForm.age.focus() ;
 	        return false;
 	     }
         if( document.myForm.age.value >40 ) { 
  	        alert( "Age Should be Less Than 41!" );
  	        document.myForm.age.focus() ;
  	        return false;
  	     }
         if(document.myForm.position.value == "-1"){
        	alert("Please provide your Position!");
        	document.myForm.position.focus();
        	return false;
         }
         if( document.myForm.salary.value == "") {
            alert( "Please provide a Salary" );
            document.myForm.salary.focus() ;
            return false;
         }
         if(isNaN( document.myForm.salary.value )) {
        	alert( "Please provide a Salary in Number" );
            document.myForm.salary.focus() ;
            return false; 
         }
         if( document.myForm.ratings.value == "-1" ) {
            alert( "Please provide your Ratings!" );
            return false;
         }
         return( true );
      }
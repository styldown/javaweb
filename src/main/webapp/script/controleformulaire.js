/**
 * 
 */
function confirmAjoutFormation(){
	if (confirm("Voulez vraiment ajouter la formation:  \n"+ formulaire.nom.value )){
		return true;
	}
	else{
		return false;
	}
}

function confirmAjoutStagiaire(){
	let nom=formulaire.nom.value;
	let prenom=formulaire.prenom.value;
	let adresse=formulaire.adresse.value;
	let tel=formulaire.tel.value;
	let email=formulaire.email.value;
	let index=formulaire.idFormation.selectedIndex;
	let formation=formulaire.idFormation.options[index].text;
	
	if (confirm("Voulez vous vraiment ajouter ce stagiaire:\n Nom: " + nom +"\nPrenom: "+prenom+
			"\nAdresse: "+ adresse+ "\nTel: "+ tel+"\nEmail :"+email+"\nFormation: "+formation)){
			return true;
			}
	else{
		return false;
	}
}


	

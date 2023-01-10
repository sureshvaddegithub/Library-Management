package com.Library_DB.Library_Management.Service;

import com.Library_DB.Library_Management.Enums.CardStatus;
import com.Library_DB.Library_Management.Models.Card;
import com.Library_DB.Library_Management.Models.Student;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    public Card createCard(Student student){
        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setStudent(student);
        return card;
    }

}

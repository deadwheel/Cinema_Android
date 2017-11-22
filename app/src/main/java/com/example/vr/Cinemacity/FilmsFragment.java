package com.example.vr.Cinemacity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.vr.Cinemacity.models.Films;


public class FilmsFragment extends ListFragment {

    private Films[] films;



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initFilms();
        ListAdapter filmsAdapter = new FilmsListAdapter(getActivity(),films);
        ListView filmsListView = (ListView) getActivity().findViewById(R.id.filmsListView);
        setListAdapter(filmsAdapter);









    }

    private void initFilms(){

       films = new Films[4];
        films[0] = new Films("American Assassin","Ekranizacja pierwszej powieści z bestsellerowego cyklu,sprzedanego na całym świecie w 25 milinach egzemplarzy. Michael Keaton, gwiazdor „BIRDMANA” i „SPOTLIGHT” w nowym filmie reżysera kultowego „HOMELAND”. Jason Bourne może już odejść na emeryturę. Mitch Rapp (Dylan O’Brien) stracił ukochaną w ataku terrorystycznym. Od tej chwili jego jedynym celem jest zemsta. Oficer szkoleniowy CIA Stan Hurley (Michael Keaton) wie, że taki człowiek to dla agencji skarb. Szczególnie jeśli uda się go wzbogacić o pewien szczególny zestaw umiejętności, który uczyni go maszyną do zadań specjalnych. Hurley potrafi tego dokonać. Zanim szkolenie dobiegnie końca Mitch będzie miał okazję wykazać się w akcji. Według danych wywiadu grupa terrorystów planuje atak z użyciem ładunku atomowego. Wiele wskazuje na to, że jednym z nich jest dawny uczeń Hurleya. Kogoś takiego może wytropić i zneutralizować tylko ktoś taki jak Mitch Rapp. ","american","15 września 2017","","112 min"," USA 2017","Michael Cuesta");
        films[1] = new Films("Na układy nie ma rady","Gwiazda hitów „7 rzeczy, których nie wiecie o facetach” i „Po prostu przyjaźń”, Grzegorz Małecki, w przezabawnej komedii o świecie wielkiej polityki, brudnej forsy, ustawionych przetargów, skorumpowanych urzędników i ich seksownych asystentek. W obsadzie filmu, m.in.: Katarzyna Glinka, Michał Milowicz, Janek Wieczorkowski, Leszek Teleszyński, Anna Powierza, Marcin Kwaśny oraz Piotr Polk. Autorem zdjęć „Na układy nie ma rady” jest Jarosław Żamojda, twórca „Młodych wilków”. „Na układy nie ma rady” w kinach od 8 września! Drobny przedsiębiorca Marek Niewiadomski (Grzegorz Małecki) ledwo wiąże koniec z końcem, usiłując spłacić długi i kredyty zaciągnięte na nowy biznes. Kiedy, ku rozpaczy Marka i jego małżonki (Katarzyna Glinka), wszystkie życiowe plany – w tym wymarzone wakacje na Kanarach – zaczynają się sypać, mężczyzna otrzymuje propozycję nie do odrzucenia. Jest nią stanowisko drugiego wiceministra w jednym z państwowych resortów. Wraz z ciepłą posadką przychodzą wpływy i pieniądze, a także niezliczone propozycje korupcyjne i… matrymonialne. Czy stawiający pierwsze kroki w świecie biznesu i wielkiej polityki Marek okaże się uczciwym obywatelem, czy też swoimi wyborami potwierdzi gorzką regułę, że na układy nie ma rady…","ukl","8 września 2017","","91 min"," Polska 2017"," Krzysztof Rurka ");
        films[2] = new Films("TO","Kiedy w mieście Derry w stanie Maine zaczynają znikać dzieci, grupa dzieciaków musi stawić czoła swoim największym lękom. Na ich drodze staje nikczemny klaun o imieniu Pennywise, który zapisał się na kartach historii jako morderca lubujący się w zadawaniu bólu. Film oparty jest na motywach niezwykle popularnej powieści Stephena Kinga pod tym samym tytułem, która przeraża czytelników od dziesięcioleci. ","to","8 września 2017","","135 min"," USA 2017"," Andres Muschietti");
        films[3] = new Films("O czym szumi las","Zwierzolas to dom dla wielu małych stworzeń: myszy, wiewiórek, ptaków. Nie zawsze jednak czują się one w nim bezpiecznie – muszą uważać, by nie zostać pożartymi przez większe i silniejsze drapieżniki. Szczególnie groźny jest lis Rudolf, który uwielbia polować na – zdawałoby się – bezbronne myszy, jak chociażby babcia Leona Myszomędrka. Ta próba prowadzi do prawdziwej rewolucji. Myszomędrek wraz z przyjaciółmi postanawiają działać! Chcą wprowadzić ustawę o życiu wszystkich zwierząt w zgodzie i zaprzestaniu wzajemnego zjadania się. Przekonanie drapieżników do nowego pomysłu będzie prawdziwym wyzwaniem. Czas pokaże, czy mu podołają. ","szumi","1 września 2017","","75 min","Norwegia 2016"," Rasmus A. Sivertsen ");
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent newIntent = new Intent(getActivity().getApplicationContext(),DisplayFilmsActivity.class);
        newIntent.putExtra("title",films[position].getTitle());
        newIntent.putExtra("desc",films[position].getDesc());
        newIntent.putExtra("img",films[position].getImg());
        newIntent.putExtra("date_show",films[position].getDate_show());
        newIntent.putExtra("year",films[position].getYear());
        newIntent.putExtra("time",films[position].getTime());
        newIntent.putExtra("production",films[position].getProduction());
        newIntent.putExtra("director",films[position].getDirector());
        startActivity(newIntent);

    }

}

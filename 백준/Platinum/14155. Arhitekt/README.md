# [Platinum I] Arhitekt - 14155

[문제 링크](https://www.acmicpc.net/problem/14155)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 9, 정답: 1, 맞힌 사람: 1, 정답 비율: 50.000%

### 분류

자료 구조, 오프라인 쿼리, 세그먼트 트리, 스위핑

### 문제 설명

<p>Matija se zaposlio u tvrtci koja se bavi izgradnjom stambenih objekata. Njemu svakodnevno stižu narudžbe klijenata koji žele graditi na odre&ntilde;enim parcelama zemlji&scaron;ta. Matijin posao je da posiječe sva stabla koja se nalaze na tim parcelama. No kada sakupi sve narudžbe, najprije treba za svaku pojedinu parcelu odrediti koliko stabala (trenutno, prije bilo kakvog ru&scaron;enja) ima unutar te parcele (uključujući i sva stabla koja se nalaze na rubu parcele).</p>

<p>Zadana je pozicija svih stabala u ravnini (dimenzija pojedinog stabla je zanemariva), te opis parcela za koje su zainteresirani klijenti. Svaka parcela je poligon s K vrhova, i to takav da mu je svaki brid ili horizontalan ili vertikalan. Bridovi jedne parcele se nikada neće me&ntilde;usobno sjeći dok se različite parcele mogu preklapati.&nbsp;</p>

### 입력

<p>U prvom retku se nalazi prirodni broj N &le; 100 000, broj stabala u ravnini. U svakom od sljedećih N redaka nalaze se po dva cijela broja X, Y (|X|, |Y| &le; 100 000), koji označavaju koordinate pojedinog stabla. Neće postojati vi&scaron;e stabala s istim koordinatama.</p>

<p>U sljedećem retku se nalazi broj Q &le; 1000, broj narudžbi klijenata. Nakon toga slijedi 2Q redaka koji opisuju narudžbe. Svaka se narudžba sastoji od 2 retka; u prvom je prirodni broj K (4 &le; K &le; 12), broj vrhova poligona koji opisuje parcelu, dok se u drugom retku nalazi 2K brojeva koji u parovima predstavljaju koordinate vrhova te parcele. Koordinate vrhova parcele bit će po apsolutnoj vrijednosti manje ili jednake od 100 000.</p>

<p>Vrhovi će biti zadani u smjeru obrnutom od kazaljke na satu. Za svaki par susjednih bridova će vrijediti da je jedan od njih horizontalan, a drugi vertikalan.&nbsp;</p>

### 출력

<p>Izlaz se sastoji od Q redaka. Za svaku narudžbu klijenta potrebno je ispisati po jedan redak koji sadrži broj stabala na odgovarajućoj parceli. A-ti redak u izlaznim podacima treba odgovarati A-toj narudžbi iz ulaznih podataka.</p>
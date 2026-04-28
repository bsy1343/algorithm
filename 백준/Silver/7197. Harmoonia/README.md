# [Silver V] Harmoonia - 7197

[문제 링크](https://www.acmicpc.net/problem/7197)

### 성능 요약

시간 제한: 7 초, 메모리 제한: 1024 MB

### 통계

제출: 94, 정답: 39, 맞힌 사람: 26, 정답 비율: 34.667%

### 분류

수학, 브루트포스 알고리즘, 사칙연산

### 문제 설명

<p>Klassikalise harmooniateooria kohaselt tuleks mitmeh&auml;&auml;lset seadet kirjutades v&auml;ltida niinimetatud paralleelkvinte, see t&auml;hendab olukorda, kus kahe h&auml;&auml;le vaheline kaugus pooltoonides annab jagamisel kaheteistk&uuml;mnega j&auml;&auml;gi seitse, seej&auml;rel m&otilde;lemas h&auml;&auml;les helik&otilde;rgus muutub ning nende vaheline kaugus pooltoonides annab j&auml;lle kaheteistk&uuml;mnega jagades j&auml;&auml;gi seitse.<sup>1</sup></p>

<p>Paralleelkvindid esinevad ainult siis, kui m&otilde;lemas h&auml;&auml;les helik&otilde;rgus muutub. See t&auml;hendab, et kui kahel j&auml;rjestikusel noodil annab kahe h&auml;&auml;le vaheline kaugus 12-ga jagades j&auml;&auml;gi 7, kuid kas &uuml;hes v&otilde;i kummaski h&auml;&auml;les helik&otilde;rgus ei muutu, siis ei ole tegemist paralleelkvintidega.</p>

<p>Kirjutada programm, mis tuvastab K-häälses seades paralleelkvintide olemasolu.</p>

<p>Helik&otilde;rgusi esitatakse sisendfailis t&auml;isarvudena. Arv 0 t&auml;histab esimese oktavi C nooti ning positiivne t&auml;isarv k sellest k pooltooni v&otilde;rra k&otilde;rgemat ja negatiivne t&auml;isarv vastavalt madalamat heli. N&auml;iteks arv 4 vastab esimese oktavi E noodile ja arv &minus;3 v&auml;ikse oktavi A noodile.<sup>2</sup></p>

<hr />
<p><sup>1</sup> M&auml;rkus muusikateooriast rohkem huvitatuile: vahel loetakse paralleelkvintideks mitte ainult kaht j&auml;rjestikust puhast kvinti, vaid ka n&auml;iteks j&auml;rjestikuseid puhast ja v&auml;hendatud kvinti (vastavalt seitse ja kuus pooltooni); selles &uuml;lesandes loeme paralleelkvintideks vaid kaht j&auml;rjestikust puhast kvinti.</p>

<p><sup>2</sup> &Uuml;lesande lahendamiseks ei ole oluline nootide nimetusi m&otilde;ista.</p>

### 입력

<p>Tekstifaili esimesel real on kaks tühikutega eraldatud täisarvu N ja K (0 &le; N &le; 100 000, 2 &le; K &le; 10) &mdash; igas hääles esinevate nootide arv N ja häälte arv K. Järgmisel N real on igauhel K tühikutega eraldatud täisarvu A<sub>1,i</sub> . . . A<sub>K,i</sub>, kus A<sub>j,i</sub> on i. noodi kõrgus j. hääles (&minus;100 &le; A<sub>K,i</sub> &le; . . . &le; A<sub>1,i</sub> &le; 100, i &isin; 1 . . . N). &Uuml;hel real antud noodid kõlavad samaaegselt ning järjestikustel ridadel olevad noodid kõlavad vahetult üksteise järel.</p>

### 출력

<p>Kui seades paralleelkvinte ei esine, väljastada tekstifaili ainsale reale sõna <code>POLE</code>. Kui seades esinevad paralleelkvindid, toimida järgmiselt. Kui paralleelkvindid tekivad noodiridade i ja i + 1 vahel häälte s ja t vahel (s &lt; t), väljastada faili eraldi reale kolm tühikutega eraldatud täisarvu i, s ja t. Väljastada kõik palas esinevad paralleelkvindid i kasvamise järjekorras. Kui kahel väljundfaili real on sama i, siis järjestada nad s kasvamise järjekorras, ning kui kahel real on sama i ja s, siis järjestada nad t kasvamise järjekorras.</p>
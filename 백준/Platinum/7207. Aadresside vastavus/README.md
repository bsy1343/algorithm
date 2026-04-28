# [Platinum III] Aadresside vastavus - 7207

[문제 링크](https://www.acmicpc.net/problem/7207)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 1, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 플로이드–워셜, 그래프 이론, 최단 경로

### 문제 설명

<p>Uurija Uuno viis &otilde;pilaste seas l&auml;bi k&uuml;sitluse, mille tulemused lubas huvilistele meilida. Hiljem aga avastas ta, et paljude &otilde;pilaste kirjutatud aadressid on v&auml;ga raskesti loetavad, ning k&uuml;sis kontrolliks klassijuhatajalt k&otilde;igi &otilde;pilaste aadresside nimekirja. N&uuml;&uuml;d tahab ta klapitada need kaks nimekirja nii, et oleks t&auml;idetud j&auml;rgmised kolm tingimust:</p>

<ol style="list-style-type: lower-alpha;">
	<li>igale esimese nimekirja aadressile vastab &uuml;ks teise nimekirja aadress,</li>
	<li>&uuml;kski teise nimekirja aadress ei vasta mitmele esimese nimekirja omale,</li>
	<li>k&otilde;igist (a) ja (b) rahuldavatest vastavustest on selles vastavuses paarides olevate aadresside erinevuste summa minimaalne.</li>
</ol>

<p>Aadresside erinevust m&otilde;&otilde;dame j&auml;rgmiselt. K&otilde;igepealt paneme t&auml;hele, et aadresse saab alati &uuml;ksteiseks teisendada m&auml;rke lisades, kustutades ja asendades. Kui m&auml;rgi lisamisel, kustutamisel ja &uuml;he m&auml;rgi teisega asendamisel on iga&uuml;hel kindel hind, v&otilde;ime kahe aadressi erinevuse defineerida kui minimaalse hinna, millega saab teise aadressi nende operatsioonidega esimeseks muuta.</p>

<p>Leida Uunole eeltoodud kolme tingimust rahuldav aadresside vastavus.</p>

### 입력

<p>Tekstifaili esimesel real on t&auml;isarv N (1 &le; N &le; 20) ja teisel real t&uuml;hikutega eraldatult N &otilde;pilastelt saadud meiliaadressi. Faili kolmandal real on t&auml;isarv M (N &le; M &le; 20) ja neljandal real t&uuml;hikutega eraldatult M &otilde;petajalt saadud aadressi.</p>

<p>Viiendal real on kaks t&auml;isarvu: &uuml;he m&auml;rgi kustutamise hind c<sub>D</sub> (0 &le; c<sub>D</sub> &le; 10<sup>6</sup>) ja lisamise hind c<sub>A</sub> (0 &le; c<sub>A</sub> &le; 10<sup>6</sup>). Kuuendal real on aadressides kasutatavate m&auml;rkide arv K (1 &le; K &le; 60) ja seitsmendal real t&auml;pselt K m&auml;rki. J&auml;rgmisel K real on igal K t&auml;isarvu, kus real 7 + i veerus j olev arv c<sub>i,j</sub> (0 &le; c<sub>i,j</sub> &le; 10<sup>6</sup>) n&auml;itab 7. real antud nimekirjas i. t&auml;he j. t&auml;hega asendamise hinda (c<sub>i,i</sub> = 0).</p>

<p>Nii Uuno poolt k&auml;sikirjadest v&auml;lja loetud kui ka &otilde;petajalt saadud aadressid sisaldavad iga&uuml;ks &uuml;limalt 100 m&auml;rki.</p>

### 출력

<p>Tekstifaili esimesele reale v&auml;ljastada leitud vastavuse erinevuste summa ja teisele reale N t&uuml;hikutega eraldatud t&auml;isarvu v<sub>i</sub>, mis n&auml;itavad, et &otilde;pilastelt saadud nimekirjas kohal i olev aadress vastab &otilde;petajalt saadud nimekirjas kohal vi olevale (kohad on nummerdatud alates 1-st).</p>
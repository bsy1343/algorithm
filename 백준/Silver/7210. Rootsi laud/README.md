# [Silver III] Rootsi laud - 7210

[문제 링크](https://www.acmicpc.net/problem/7210)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 18, 맞힌 사람: 16, 정답 비율: 69.565%

### 분류

수학, 구현, 브루트포스 알고리즘, 정수론, 시뮬레이션

### 문제 설명

<p>Arvatakse, et šokolaad soodustab ajutegevust. Sellep&auml;rast ei lase elutark professor Trinidad Itobagovit&scaron; kunagi m&ouml;&ouml;da v&otilde;imalust &scaron;okolaadikommidega maiustada.</p>

<p>Koolivaheajal suusakuurordis puhates leidis Trinidad suurep&auml;rase kohviku, kus pakutakse hommikus&ouml;&ouml;ki rootsi lauas. &Uuml;hele suurele &uuml;mmargusele lauale on pandud N kandikut, iga&uuml;hel mingi arv &scaron;okolaadikomme. Kandikule number i pannakse igal hommikul A<sub>i</sub> kommi. Kandikud on nummerdatud p&auml;rip&auml;eva 1 . . . N, kandikule number N j&auml;rgneb j&auml;lle kandik number 1.</p>

<p>Suure šokolaadis&otilde;brana s&ouml;&ouml;ks Trinidad meelsasti &auml;ra k&otilde;ik laual olevad kommid, aga kasvatus ja &uuml;hiskondlik surve ei luba tal seda teha. Seep&auml;rast valib ta t&auml;isarvu K ja v&otilde;tab laua &uuml;mber ringi k&auml;ies &auml;ra k&otilde;ik kommid igalt K. kandikult. See t&auml;hendab, et Trinidad l&auml;heb mingi kandiku juurde, v&otilde;tab sellelt k&otilde;ik kommid, seej&auml;rel liigub laua &auml;&auml;rt m&ouml;&ouml;da p&auml;rip&auml;eva ja esialgsest kandikust loendades K kandiku v&otilde;rra edasi j&otilde;udes v&otilde;tab ka sellelt k&otilde;ik kommid ning j&auml;tkab samamoodi. Kui j&auml;rjekordne kandik, millelt Trinidad komme v&otilde;tta tahaks, on juba t&uuml;hi (sest ta on selle juures juba peatunud), l&otilde;petab ta kommide kogumise ja asub nende s&ouml;&ouml;mise juurde. Kuna Trinidad s&ouml;&ouml;b hommikust v&auml;ga vara, v&otilde;ib eeldada, et keegi teine samal ajal kandikutelt komme ei v&otilde;ta.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/7210.%E2%80%85Rootsi%E2%80%85laud/a1406d75.png" data-original-src="https://upload.acmicpc.net/b36f8274-2d7e-4aa3-8e88-b0ff1ad30ee0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 574px; height: 147px;" /></p>

<p>Ilmselt s&otilde;ltub kogutud kommide arv sellest, millise kandiku juurest Trinidad oma ringk&auml;iku alustab. Ta v&otilde;ib alustada &uuml;ksk&otilde;ik millise kandiku juurest, aga ta ei tea, millisest alustades ta l&otilde;puks k&otilde;ige rohkem komme kokku saab. Aita tal leida, kui palju komme ta maksimaalselt koguda v&otilde;ib.</p>

### 입력

<p>Tekstifaili esimesel real on t&uuml;hikuga eraldatud t&auml;isarvud N ja K (2 &le; K &le; N &le; 10<sup>5</sup>), vastavalt kandikute arv ja Trinidadi valitud arv. Teisel real on N t&auml;isarvu A<sub>i</sub> (1 &le; A<sub>i</sub> &le; 10<sup>4</sup>, i &isin; 1 . . . N), kus A<sub>i</sub> on kommide arv kandikul number i.</p>

### 출력

<p>Tekstifaili v&auml;ljastada &uuml;ks t&auml;isarv, maksimaalne kommide arv, mille Trinidad v&otilde;ib &uuml;he serveerimislaua juures k&auml;iguga koguda.</p>
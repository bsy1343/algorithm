# [Silver III] Sausainiai - 30340

[문제 링크](https://www.acmicpc.net/problem/30340)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 29, 맞힌 사람: 22, 정답 비율: 51.163%

### 분류

그리디 알고리즘, 정렬, 게임 이론

### 문제 설명

<p>Dvyniai Antanas ir Bronius gimtadienio proga gavo didelę dėžę sausainių. I&scaron; viso joje yra N skirtingų sausainių, sunumeruotų nuo 1 iki N.</p>

<p>Dvyniams ne visi sausainiai patinka vienodai: i-ąjį sausainį Antanas vertintų a<sub>i</sub> balų, o Bronius jį vertintų b<sub>i</sub> balų. Kuo įvertis didesnis, tuo labiau sausainis patinka. Abu dvyniai žino, kiek balų kiekvienas i&scaron; jų skirtų kiekvienam sausainiui.</p>

<p>Mama pasiūlė dvyniams saldumynus pasidalinti &scaron;itaip: pirmasis vieną sausainį pasirinktų Antanas, paskui i&scaron; likusių sausainių vieną pasirinktų Bronius ir taip toliau, iki dėžė i&scaron;tu&scaron;tėtų.</p>

<p>Broliai nėra labai draugi&scaron;ki, todėl kiekvienas stengsis rinktis sausainius taip, kad pasibaigus dalyboms jo pasirinktų sausainių įverčių suma būtų kaip įmanoma didesnė už kito brolio pasirinktų sausainių įverčių sumą.</p>

<p>Kitaip tariant, jei dalybų metu Antanas pasirenka sausainius, kuriuos jis įvertina A balų, o Bronius pasirenka sausainius, vertus B balų, tai Antano tikslas yra pasiekti, kad dalybų pabaigoje skirtumas A &minus; B būtų kaip galima didesnis, o Broniaus &ndash; kad skirtumas B &minus; A būtų kuo didesnis.</p>

<p>Apskaičiuokite, kam bus lygus skirtumas A&minus;B, jei abu dvyniai sausainius rinksis optimaliai.</p>

### 입력

<p>Pirmoje eilutėje pateiktas sausainių skaičius N. Toliau eina N eilučių, kurių kiekvienoje pateikta po du sveikuosius skaičius:</p>

<ul>
	<li>a<sub>i</sub> &ndash; Antano skiriami balai i-ajam sausainiui;</li>
	<li>b<sub>i</sub> &ndash; Broniaus skiriami balai i-ajam sausainiui.</li>
</ul>

### 출력

<p>I&scaron;veskite vieną sveikąjį skaičių &ndash; skirtumo A&minus;B reik&scaron;mę, jei dvyniai sausainius dalinsis pagal optimalią strategiją.</p>
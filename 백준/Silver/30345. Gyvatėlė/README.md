# [Silver I] Gyvatėlė - 30345

[문제 링크](https://www.acmicpc.net/problem/30345)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 29, 정답: 12, 맞힌 사람: 12, 정답 비율: 63.158%

### 분류

구현, 기하학, 시뮬레이션

### 문제 설명

<p>Mantas mėgsta žaisti klasikinį Gyvatėlės žaidimą. Žaidimo esmė paprasta &ndash; valgyk obuolius, augink gyvatėlę ir neleisk jos galvai susidurti su kūnu.</p>

<p>Kartą Mantui pavyko laimėti &scaron;į žaidimą &ndash; gyvatėlė guli spiralės pavidalu, kaip parodyta paveikslėlyje, ir užima kiekvieną ekrano ta&scaron;ką.</p>

<p>Pažymėkime gyvatėlės galvos koordinatę (0; 0). Žinodami ekrano plotį N ir auk&scaron;tį M, apskaičiuokite gyvatėlės ilgį nuo galvos iki duoto kūno ta&scaron;ko (X; Y ).</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/50debb8e-b1fd-425a-85b0-23a81f87bb3f/-/preview/" style="width: 273px; height: 265px;" /></p>

<p style="text-align: center;">1 pav. N = 6, M = 6; gyvatėlės ilgis nuo galvos iki X = 2, Y = 4 yra 28</p>

<p>Atkreipkite dėmesį &ndash; koordinatės didėja į de&scaron;inę ir žemyn, o gyvatėlės ilgis skaičiuojamas langeliais nuo galvos vidurio iki duoto kūno langelio vidurio ta&scaron;ko.</p>

<p>Apskaičiuokite gyvatėlės ilgį nuo galvos iki duoto kūno langelio vidurio ta&scaron;ko.</p>

### 입력

<p>Pirmoje ir vienintelėje eilutėje pateikti keturi sveikieji skaičiai: ekrano plotis N, auk&scaron;tis M bei gyvatėlės kūno ta&scaron;ko koordinatės X ir Y .</p>

### 출력

<p>I&scaron;veskite vieną skaičių &ndash; gyvatėlės ilgį nuo galvos iki ta&scaron;ko (X; Y).</p>

### 제한

<ul>
	<li>1 &le; N, M &le; 20 000</li>
	<li>0 &le; X &lt; N</li>
	<li>0 &le; Y &lt; M</li>
</ul>
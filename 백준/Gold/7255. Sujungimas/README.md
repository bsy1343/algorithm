# [Gold IV] Sujungimas - 7255

[문제 링크](https://www.acmicpc.net/problem/7255)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 132, 정답: 40, 맞힌 사람: 32, 정답 비율: 31.068%

### 분류

그래프 이론, 자료 구조, 그리디 알고리즘, 분리 집합, 최소 스패닝 트리

### 문제 설명

<p>Bitlandijoje pertvarkoma traukinių infrastruktūra. &Scaron;is darbas paskirtas Bitlandijos Traukinių Kompanijos vadovui Martynui.</p>

<p>Pirmiausia Martynas įvertino į kiekvieną miestą i atvykstančių keleivių srautą S<sub>i</sub>. Martynas tarp miestų projektuoja geležinkelio linijas, tokias kad:</p>

<ul>
	<li>I&scaron; kiekvieno Bitlandijos miesto geležinkeliu būtų galima nukeliauti į bet kurį kitą Bitlandijos miestą (nebūtinai tiesiogiai).</li>
	<li>Nutiesti vieną traukinių liniją tarp miestų i ir j kainuoja S<sub>i</sub> &times; S<sub>j</sub> biteurų &ndash; didesnis srautas reikalauja daugiau investicijų (didesnė stotis, didesnis parkingas ir t.t.).</li>
</ul>

<p>Dalis geležinkelių Bitlandijoje jau nutiesti, bet sumažėjus biudžetui Martynas nori nutiesti trūkstamas linijas už kuo mažesnę kainą.</p>

<p>Nustatykite, už kokią mažiausią kainą galima nutiesti likusias geležinkelio linijas, taip kad būtų tenkinami Martyno i&scaron;kelti reikalavimai.</p>

### 입력

<p>Pirmoje eilutėje pateikiami tarpu atskirti skaičiai N ir M &ndash; Bitlandijos miestų bei jau nutiestų geležinkelio linijų skaičius.</p>

<p>Antroje eilutėje pateikiami N tarpais atskirti skaičiai S<sub>i</sub>.</p>

<p>Tolimesnėse M eilučių pateikiama po du skaičius v<sub>i</sub> ir u<sub>i</sub>, rei&scaron;kiančius, kad tarp miestų v<sub>i</sub> ir u<sub>i</sub> jau nutiesta tiesioginė geležinkelio linija.</p>

### 출력

<p>I&scaron;veskite kiek mažiausiai biteurų kainuos likusių geležinkelio linijų nutiesimas.</p>

### 힌트

<ul>
	<li>1 &le; N &le; 100 000</li>
	<li>0 &le; M &le; 100 000</li>
	<li>1 &le; S<sub>i</sub> &le; 100</li>
	<li>1 &le; v<sub>i</sub>, u<sub>i</sub> &le; N</li>
	<li>Visos poros (v<sub>i</sub>, u<sub>i</sub>) skirtingos ir v<sub>i</sub> &ne; u<sub>i</sub>.</li>
</ul>
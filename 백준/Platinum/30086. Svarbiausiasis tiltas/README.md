# [Platinum IV] Svarbiausiasis tiltas - 30086

[문제 링크](https://www.acmicpc.net/problem/30086)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 21, 맞힌 사람: 15, 정답 비율: 55.556%

### 분류

그래프 이론, 그래프 탐색, 트리, 깊이 우선 탐색, 센트로이드, 단절점과 단절선

### 문제 설명

<p>Valstybei priklauso $2 \times N$ salų (sunumeruotų nuo $1$ iki $2N$), kurias jungia $M$ tiltų. Siekiant pritraukti daugiau turistų, buvo nuspręsta i&scaron;rinkti svarbiausiąjį tiltą ir jį kasnakt ap&scaron;viesti vis kitomis spalvomis.</p>

<p>Buvo pateiktas pasiūlymas, kad <em>svarbiausiasis</em> miesto tiltas turėtų būti tas, kurį uždarius valstybė taptų padalinta į du regionus, turinčius vienodą skaičių salų (t. y. lygiai po $N$), ir nebūtų įmanoma sausuma nuvykti i&scaron; vieno regiono į kitą.</p>

<p>Duoti $N$, $M$ bei salų sujungimo tiltais schema. Raskite svarbiausiąjį tiltą.</p>

### 입력

<p>Pirmojoje eilutėje pateikti sveikieji skaičiai $N$ ir $M$. Kitose $M$ eilučių pateikiama po du tarpais atskirtus skaičius $i$ ir $j$ ($i \ne j$), kurie rei&scaron;kia, kad $i$-toji ir $j$-toji salos yra sujungtos tiltu.</p>

### 출력

<p>I&scaron;veskite svarbiausiojo tilto numerį.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 5\,000$</li>
	<li>$0 &le; M &le; 100\,000$</li>
	<li>$2 \times N + M &le; 100\,000$</li>
	<li>Duomenys tokie, kad:
	<ul>
		<li>Dvi salas jungia ne daugiau kaip vienas tiltas;</li>
		<li>I&scaron; bet kokios salos galima tiltais nukeliauti į bet kokią kitą salą;</li>
		<li><em>Svarbiausiasis</em> tiltas visada egzistuos.</li>
	</ul>
	</li>
</ul>
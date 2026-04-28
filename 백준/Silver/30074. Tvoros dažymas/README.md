# [Silver III] Tvoros dažymas - 30074

[문제 링크](https://www.acmicpc.net/problem/30074)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 21, 맞힌 사람: 16, 정답 비율: 66.667%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Tomas ir Barbora susiruo&scaron;ė perdažyti močiutės kiemo tvorą. Tomas valys senus tvoros dažus, o Barbora &ndash; dažys.</p>

<p>Tvora sudaryta i&scaron; $N$ stulpelių, kurių kiekvieną Tomas nuvalo per $V$ minučių, o Barbora nudažo per $Z$ minučių. Tvoros stulpelis turi būti visi&scaron;kai nuvalytas prie&scaron; pradedant jį dažyti, t.y., vaikai negali vienu metu dirbti prie to paties stulpelio.</p>

<p>Kad Barborai reikėtų mažiau laukti, Tomas atsikėlė ir darbus pradėjo $T$ minučių anksčiau nei Barbora. Visgi anūkė numatė, kad gali tekti palaukti, todėl pasiėmė komiksų paskaityti.</p>

<p>Suskaičiuokite, kiek minučių Barbora galės skaityti komiksus nuo jos darbo pradžios iki visa tvora bus perdažyta.</p>

### 입력

<p>Pirmojoje eilutėje pateikti keturi tarpais atskirti sveikieji skaičiai:</p>

<ul>
	<li>$N$ &ndash; tvoros stulpelių skaičius;</li>
	<li>$V$ &ndash; laikas, per kurį Tomas nuvalo vieną tvoros stulpelį;</li>
	<li>$Z$ &ndash; laikas, per kurį Barbora nudažo vieną tvoros stulpelį;</li>
	<li>$T$ &ndash; kiek minučių anksčiau Tomas pradėjo darbą nei Barbora.</li>
</ul>

### 출력

<p>I&scaron;veskite minučių, kurias Barbora galės skirti komiksų skaitymui, skaičių.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 1\,000$</li>
	<li>$1 &le; V, Z &le; 100$</li>
	<li>$0 &le; T &le; 100\,000$</li>
</ul>
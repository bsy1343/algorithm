# [Bronze II] Kaladėlės - 7278

[문제 링크](https://www.acmicpc.net/problem/7278)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 170, 정답: 103, 맞힌 사람: 77, 정답 비율: 63.636%

### 분류

수학, 구현, 브루트포스 알고리즘, 사칙연산

### 문제 설명

<p>Ignas turi trijų rū&scaron;ių kaladėlių. Kiekvienos rū&scaron;ies kaladėlės yra skirtingos spalvos ir skirtingo auk&scaron;čio. Igno džiaugsmui, kiekvienos rū&scaron;ies kaladėlių jis turi be galo daug.</p>

<p>I&scaron; &scaron;ių kaladėlių jis nori pastatyti N centimetrų auk&scaron;čio bok&scaron;tą. Tačiau Ignas nori, kad bok&scaron;tas būtų vienspalvis, tad jis gali naudoti tik vienos rū&scaron;ies kaladėles.</p>

<p>Gali būti, kad i&scaron; vienos rū&scaron;ies kaladėlių neįmanoma pastatyti lygiai N centimetrų bok&scaron;to. Pavyzdžiui, jei kaladėlių auk&scaron;tis yra 3 cm, tuomet i&scaron; jų galima pastatyti 3 cm, 6 cm, ar 9 cm bok&scaron;tus, bet negalima pastatyti bok&scaron;tų, kurių auk&scaron;tis būtų 7 cm ar 10 cm.</p>

<p>Ignas nori pasirinkti tokias kaladėles, i&scaron; kurių jis galėtų pastatyti bok&scaron;tą, kuo artimesnį auk&scaron;čiui N. Padėkite Ignui pasirinkti tam tinkamiausias kaladėles.</p>

### 입력

<p>Pirmoje eilutėje pateiktas norimo statyti bok&scaron;to auk&scaron;tis N (centimetrais). Antroje eilutėje pateikti trys skaičiai a, b ir c: trijų rū&scaron;ių kaladėlių auk&scaron;čiai (centimetrais). &Scaron;ie skaičiai yra skirtingi.</p>

### 출력

<p>I&scaron;veskite du sveikus skaičius: kokio auk&scaron;čio kaladėles jis turi pasirinkti, ir kokio auk&scaron;čio (artimiausio N) bok&scaron;tą jis galės i&scaron; jų pastatyti.</p>

### 제한

<ul>
	<li>1 &le; N &le; 1 000</li>
	<li>1 &le; a &lt; b &lt; c &le; 100</li>
</ul>
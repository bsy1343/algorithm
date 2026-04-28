# [Silver III] Žygis - 30072

[문제 링크](https://www.acmicpc.net/problem/30072)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 9, 맞힌 사람: 9, 정답 비율: 69.231%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Žygeivis Vytis planuoja &scaron;iandien pasivaik&scaron;čioti po kalnus. Pasitiesęs reljefo žemėlapį i&scaron;sirinko mar&scaron;rutą, kuris pavaizduotas kalnų auk&scaron;čių seka. Keliaudamas nuo $i$-ojo ta&scaron;ko iki $i + 1$-ojo, Vytis užlipa ar nusileidžia tik auk&scaron;čių skirtumą, o jei ta&scaron;kai vienodame auk&scaron;tyje &ndash; eina tiesiai. Vytis pradeda ir baigia žygį ties jūros lygiu (auk&scaron;tis &ndash; $0$).</p>

<p>Vytis yra patyręs žygeivis ir žino, kad nueiti, užkopti ar nusileisti vieną metrą jam užtruks vieną laiko vienetą. Taip pat žino, kaip kinta jo energija:</p>

<ul>
	<li>Papusryčiavęs jis įgauna energijos $E_0$.</li>
	<li>Kopdamas auk&scaron;tyn kiekvienam metrui sueikvoja $E_u$ energijos.</li>
	<li>Leisdamasis žemyn kiekvienam metrui sueikvoja $E_n$ energijos.</li>
	<li>Vyčiui tiesiai eiti nesunku, tai eidamas tiesiai energijos nesueikvoja, tačiau jei visi&scaron;kai neturi energijos, tiesiai žygiuoti jis negali.</li>
	<li>Jei Vytis žygio metu i&scaron;naudoja visą energiją, jis prisėda pailsėti. Kai ilsisi žygio metu, per vieną laiko vienetą įgauna $E_g$ energijos.</li>
</ul>

<p>Pavyzdžiui, Vytis papusryčiavęs įgauna energijos $E_0 = 6$, užlipdamas sueikvoja $E_u = 3$, nulipdamas sueikvoja $E_n = 1$, ilsėdamasis įgauna $E_g = 1$ ir susiplanavo eiti tokiu kalnu:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/30072.%E2%80%85%C5%BDygis/fef5c8b9.png" data-original-src="https://upload.acmicpc.net/c59469d9-a446-4401-a2a8-2354634d52c4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 243px; height: 151px;" /></p>

<p style="text-align: center;">1 pav. De&scaron;inėje pavaizduotas auk&scaron;tis, po paveikslėliu &ndash; mar&scaron;ruto ta&scaron;kai.</p>

<ul>
	<li>Vytis užlips ant pirmojo ta&scaron;ko savo mar&scaron;rute, tam i&scaron;naudos $1$ laiko vienetą ir $3$ energijos vienetus.</li>
	<li>Vytis užlips ant antrojo ta&scaron;ko savo mar&scaron;rute, tam i&scaron;naudos $1$ laiko vienetą ir $3$ energijos vienetus.</li>
	<li>Čia Vytis sustos pailsėti, nes energijos nebeturi. Pailsėjęs vieną laiko momentą įgaus $1$ energijos vienetą.</li>
	<li>Vytis nueis prie trečiojo ta&scaron;ko, tam sugai&scaron; $1$ laiko momentą, bet nei&scaron;naudos energijos.</li>
	<li>Kadangi Vyčiui neužteks energijos nulipti nuo trečiojo ta&scaron;ko, jam teks sustoti pailsėti dar vieną laiko momentą.</li>
	<li>Vytis nulips nuo trečiojo ta&scaron;ko, tai užims $2$ laiko momentus ir tam sunaudos $2$ energijos vienetus.</li>
</ul>

<p>Tad Vytis keliaus $7$ laiko momentus, i&scaron; kurių $5$ lips ar eis, ir $2$ ilsėsis.</p>

<p>Suskaičiuokite, kiek laiko truks Vyčio žygis, jei Vytis i&scaron;vyksta į žygį papusryčiavęs.</p>

### 입력

<p>Pirmojoje eilutėje pateikti keturi skaičiai, nurodantys:</p>

<ul>
	<li>$E_0$ &ndash; Vyčio energija papusryčiavus;</li>
	<li>$E_u$ &ndash; kiek Vytis sunaudoja energijos užkopdamas vieną metrą auk&scaron;tyn;</li>
	<li>$E_n$ &ndash; kiek Vytis sunaudoja energijos nusileisdamas vieną metrą žemyn;</li>
	<li>$E_g$ &ndash; kiek Vytis įgauna energijos per vieną laiko vienetą kai ilsisi.</li>
</ul>

<p>Antrojoje eilutėje nurodytas mar&scaron;ruto ilgis $N$.</p>

<p>Tolimesnėse $N$ eilučių pateiktas mar&scaron;rutas kalnų auk&scaron;čių sekos $h_i$ pavidalu.</p>

### 출력

<p>I&scaron;veskite sveikąjį skaičių, nurodantį, kiek laiko vienetų truks Vyčio žygis</p>

### 제한

<ul>
	<li>$1 &le; E_0, E_g, E_u, E_n &le; 1\,000$</li>
	<li>$1 &le; N &le; 100\,000$</li>
	<li>$1 &le; h_i &le; 10\,000$</li>
</ul>
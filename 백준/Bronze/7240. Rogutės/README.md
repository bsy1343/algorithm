# [Bronze III] Rogutės - 7240

[문제 링크](https://www.acmicpc.net/problem/7240)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 372, 정답: 284, 맞힌 사람: 270, 정답 비율: 78.488%

### 분류

수학, 구현, 사칙연산, 시뮬레이션

### 문제 설명

<p>Nyk&scaron;tukas mėgsta leistis nuo kalno rogučių trasa. Pasiruo&scaron;us leistis žemyn (pradiniu momentu) rogučių greitis lygus 0. Nusileidimo trasa padalinta į N atkarpų ir žinoma, kaip pakinta rogučių greitis įveikus kiekvieną i&scaron; jų: padidėja ar sumažėja a<sub>i</sub> m/s.</p>

<p>Nyk&scaron;tuko rogutės yra i&scaron;manios &ndash; matuoja greitį ir jei reikia, pristabdo. Jei rogučių greitis atkarpų sandūroje vir&scaron;ija S m/s, rogutės pristabdomos, t.y. jų greitis sumažėja 1 m/s. Rogutės stabdomos tik atkarpų sandūroje, bet ne trasos pabaigoje.</p>

<p>Nustatykite, kokiu greičiu čiuo&scaron; rogutės kalno apačioje (įveikus paskutinę trąsos atkarpą).</p>

### 입력

<p>Pirmoje eilutėje pateiktas trasos atkarpų skaičius N ir greitis S, kurį vir&scaron;ijus rogutės bus pristabdomos.</p>

<p>Kitose N eilučių pateikta po vieną skaičių a<sub>i</sub> &ndash; kiek pakinta rogučių greitis įveikus atitinkamą trasos atkarpą.</p>

### 출력

<p>I&scaron;veskite rogučių greitį trasos pabaigoje.</p>

<p>Pradiniai duomenys visada yra tokie, kad rogutės būtinai įveiks visą trasą, t. y. greitis niekada nesumažės iki 0 (nebent trasos pabaigoje).</p>

### 제한

<ul>
	<li>2 &le; N, S &le; 1000</li>
	<li>-10 &le; a<sub>i</sub> &le; 10</li>
</ul>
# [Platinum V] Mistrzostwa - 8809

[문제 링크](https://www.acmicpc.net/problem/8809)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 5, 맞힌 사람: 5, 정답 비율: 29.412%

### 분류

그리디 알고리즘, 트리

### 문제 설명

<p>Firma Instant Preprocessing ma hierarchiczną strukturę zwierzchnictwa:</p>

<ul>
	<li>Każda osoba ma co najwyżej jednego&nbsp;<em>bezpośredniego</em>&nbsp;przełożonego.</li>
	<li>Relacja bycia przełożonym jest przechodnia, co oznacza, że jeśli&nbsp;<strong>A</strong>&nbsp;jest przełożonym&nbsp;<strong>B</strong>&nbsp;( niekoniecznie bezpośrednim ) i&nbsp;<strong>B</strong>&nbsp;jest przełożonym&nbsp;<strong>C</strong>, to&nbsp;<strong>A</strong>&nbsp;jest przełożonym&nbsp;<strong>C</strong>.</li>
	<li>W relacji nie występują cykle, to znaczy nie istnieją 2 osoby&nbsp;<strong>A</strong>,<strong>B</strong>&nbsp;takie, że:&nbsp;<strong>A</strong>&nbsp;jest przełożonym&nbsp;<strong>B</strong>&nbsp;i&nbsp;<strong>B</strong>&nbsp;jest jest przełożonym&nbsp;<strong>A</strong>.&nbsp;</li>
</ul>

<p>Firma postanowiła zorganizować mistrzostwa w siatk&oacute;wce plażowej w kt&oacute;rych startują dwuosobowe zespoły złożone z pracownik&oacute;w firmy. Aby pracownicy nie czuli się skrępowani, mogą powstawać tylko pary (<strong>A</strong>,<strong>B</strong>) takie, że&nbsp;<strong>A</strong>&nbsp;nie jest przełożonym&nbsp;<strong>B</strong>&nbsp;i&nbsp;<strong>B</strong>&nbsp;nie jest przełożonym&nbsp;<strong>A</strong>. Ile maksymalnie drużyn może wystartować w mistrzostwach?</p>

<p>Jedna osoba może wejść w skład co najwyżej jednej drużyny.</p>

### 입력

<p>W pierwszej linii wejścia&nbsp;znajduje się liczba zestaw&oacute;w test owych&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ).</p>

<p>W pierwszej lini pojedynczego zestawu znajduje się liczba&nbsp;<strong>N</strong>&nbsp;( 1 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 10<sup>5&nbsp;</sup>)<sup>&nbsp;</sup>oznaczająca ilość pracownik&oacute;w firmy. W drugiej lini znajduje się&nbsp;<strong>N</strong>&nbsp;liczb&nbsp;<strong>a</strong><sub>i</sub>&nbsp;( 1 &lt;=&nbsp;<strong>a</strong><sub><strong>i</strong></sub>&nbsp;&lt;=&nbsp;<strong>N</strong>&nbsp;lub&nbsp;<strong>a</strong><sub><strong>i</strong></sub>&nbsp;= -1<strong>&nbsp;</strong>).&nbsp;<strong>a</strong><sub><strong>i</strong></sub>&nbsp;oznacza numer bezpośredniego przełożonego osoby numer&nbsp;<strong>i</strong>. Jeśli&nbsp;<strong>a</strong><sub>i&nbsp;</sub>= -1, to&nbsp;<strong>i</strong>-ta osoba nie ma przełożonego.</p>

### 출력

<p>Dla kazdego zestawu testowego wypisz w osobnej linii maksymalną ilość drużyn jaka może wystartować w mistrzostwach.</p>
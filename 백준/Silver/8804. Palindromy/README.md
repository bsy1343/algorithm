# [Silver V] Palindromy - 8804

[문제 링크](https://www.acmicpc.net/problem/8804)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 145, 정답: 127, 맞힌 사람: 115, 정답 비율: 89.147%

### 분류

문자열, 애드 혹

### 문제 설명

<p>Słowo nazywamy palindromem, jeśli jest takie samo czytane od lewej do prawej jak i wspak. Przykładami palindrom&oacute;w są słowa&nbsp;<em>kajak</em>,&nbsp;<em>abba</em>.</p>

<p>Adam napisał na kartce słowo&nbsp;<strong>S</strong>. Gosia planuje pokolorować litery słowa&nbsp;<strong>S</strong>&nbsp;tak, aby&nbsp;litery pokolorowane tym samym kolorem tworzyły palindromy ( w razie wątpliwości sp&oacute;jrz do&nbsp;<em>przykładu</em>&nbsp;i&nbsp;<em>wyjaśnienia przykładu</em>). Twoim zadaniem jest określenie ilu minimalnie kolor&oacute;w potrzebuje Gosia aby spełnić sw&oacute;j cel. Adam potrafi pisać tylko dwie pierwsze litery alfabetu:&nbsp;<em>A</em>&nbsp;i&nbsp;<em>B</em>, dlatego słowo&nbsp;<strong>S</strong>&nbsp;nie zawiera innych liter.</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba zestaw&oacute;w testowych&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ).</p>

<p>Pojedynczy zestaw testowy składa się z jednej lini, kt&oacute;ra zawiera słowo&nbsp;<strong>S</strong>&nbsp;( 1 &lt;= (długość słowa&nbsp;<strong>S)</strong>&nbsp;&lt;= 10<sup>5</sup>&nbsp;).</p>

### 출력

<p>Dla każdego zestawu testowego należy wypisać minimalną liczbę kolor&oacute;w potrzebnych Gosi.</p>

### 힌트

<p>W teście pierwszym Gosia może pokolorować całe słowo jednym kolorem.</p>

<p>W drugim teście Gosia może pokolorować drugą literę kolorem niebieskim a pozostałe czerwonym. W ten spos&oacute;b literki niebieskie stworzą słowo &quot;B&quot; a literki czerwone słowo &quot;AABBAA&quot;. Oba te słowa są palindromami.</p>
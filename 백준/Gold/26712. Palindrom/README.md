# [Gold IV] Palindrom - 26712

[문제 링크](https://www.acmicpc.net/problem/26712)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 37, 정답: 25, 맞힌 사람: 22, 정답 비율: 70.968%

### 분류

그리디 알고리즘, 문자열, 애드 혹

### 문제 설명

<p>Bajtek, dzięki uczęszczaniu na k&oacute;łko informatyczne, dowiedział się czym jest palindrom. Palindrom to słowo, kt&oacute;re jest takie samo czytane od lewej do prawej jak od prawej do lewej. Na przykład słowa &bdquo;oko&rdquo;, &bdquo;kajak&rdquo;, &bdquo;kobyłamamałybok&rdquo; i &bdquo;ababbaba&rdquo; są palindromami, zaś słowa &bdquo;kajaki&rdquo;, &bdquo;zoo&rdquo;, &bdquo;alamakota&rdquo; i &bdquo;abaababa&rdquo; nimi nie są.</p>

<p>Chłopak ucieszony nową wiedzą szybko otworzył notatnik (nie zeszyt, taki program) i zapisał w nim słowo składające się z liter &rsquo;<code>a</code>&rsquo; oraz &rsquo;<code>b</code>&rsquo;. Po chwili zastanowienia dotarło jednak do niego, że jego słowo niekoniecznie musi być palindromem. Postanowił to jednak naprawić! W ciągu jednej sekundy chłopak może wybrać dwie sąsiadujące ze sobą litery i zamienić je miejscami. Czy będzie w stanie, wykonując ciąg takich ruch&oacute;w (lub nie robiąc nic) doprowadzić do tego, że jego słowo będzie palindromem? Jeśli tak, to ile minimalnie sekund zajmą mu takie zmiany? Pom&oacute;ż mu i napisz program kt&oacute;ry to obliczy!</p>

### 입력

<p>W jedynym wierszu wejścia znajduje się niepuste słowo zapisane w notatniku Bajtka. Słowo to może zawierać jedynie znaki &rsquo;<code>a</code>&rsquo; oraz &rsquo;<code>b</code>&rsquo;, a jego długość nie przekroczy 200 000 znak&oacute;w.</p>

### 출력

<p>Na wyjściu powinna znaleźć się jedna liczba całkowita, oznaczająca minimalną liczbę sekund potrzebną do zmienienia słowa z notatnika Bajtka w palindrom. Jeśli nie jest to możliwe, zamiast tego powinna się tam znaleźć liczba &minus;1.</p>

### 힌트

<p>Wyjaśnienie przykładu: W pierwszym teście przykładowym Bajtek może (na przykład) wykonać ciąg zmian <code>abbaaab</code> &rarr; <code><u>ba</u>baaab</code> &rarr; <code>ba<u>ab</u>aab</code>, kt&oacute;ry poprawnie zamieni jego słowo w palindrom, co zajmie mu dwie sekundy. Można wykazać, że nie da się zamienić jego słowa w palindrom szybciej.</p>

<p>W drugim teście przykładowym słowo Bajtka może być postaci <code>ab</code> i <code>ba</code>. Żadne z tych sł&oacute;w nie jest palindromem, przez co chłopak nie będzie m&oacute;gł wykonać zadania.</p>
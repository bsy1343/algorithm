# [Bronze II] Wymiana żarówki - 8846

[문제 링크](https://www.acmicpc.net/problem/8846)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 204, 정답: 141, 맞힌 사람: 114, 정답 비율: 67.857%

### 분류

수학, 사칙연산

### 문제 설명

<p>Jak wiadomo, do wymiany żar&oacute;wki często wystarcza jedna osoba. Jeśli sufit jest za wysoko, potrzebujemy już pięciu ludzi: jeden stoi na stole trzymając żar&oacute;wkę a reszta kręci stołem.</p>

<p>Jeśli sufit jest jeszcze wyżej, można p&oacute;jść o krok dalej: jedna osoba trzyma żar&oacute;wkę, cztery osoby trzymają st&oacute;ł, a dodatkowo każda z tych czterech os&oacute;b także stoi na stole, utrzymywanym przez kolejne cztery osoby. Razem daje to 1 + 4 + 16 =&nbsp; 21 os&oacute;b. Metodę tę można oczywiście rozszerzać w zależności od wysokości sufitu.</p>

<p>Oblicz, ile os&oacute;b potrzebnych jest do zbudowania konstrukcji o zadanej wysokości. Ponieważ wynik może być bardzo duży, wystarczy, że podasz jego resztę z dzielenia przez 500000009.</p>

### 입력

<p>Na wejściu znajduje się dokładnie jedna liczba całkowita A (1&lt;=A&lt;=1000000), oznaczająca ilość poziom&oacute;w konstrukcji, jaką musimy osiągnąć.</p>

### 출력

<p>Minimalna liczba os&oacute;b potrzebna do wymiany żar&oacute;wki, podana modulo 500000009 (zamiast liczby, należy wypisać jej resztę z dzielenia przez 500000009).</p>
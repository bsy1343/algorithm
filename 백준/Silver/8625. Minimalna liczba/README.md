# [Silver IV] Minimalna liczba - 8625

[문제 링크](https://www.acmicpc.net/problem/8625)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 86, 정답: 58, 맞힌 사람: 47, 정답 비율: 65.278%

### 분류

수학, 자료 구조, 정렬, 사칙연산, 집합과 맵, 해시를 사용한 집합과 맵, 비둘기집 원리

### 문제 설명

<p>Dany jest zbi&oacute;r liczb całkowitych $A$. Należy znaleźć najmniejszą liczbę całkowitą dodatnią nienależącą do zbioru&nbsp;$A$&nbsp;i podzielną przez pewną z g&oacute;ry ustaloną liczbę $k$.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia opis zbioru $A$&nbsp;oraz liczbę $k$,</li>
	<li>wyznaczy najmniejszą liczbę całkowitą dodatnią, kt&oacute;rej nie ma w zbiorze $A$&nbsp;i kt&oacute;ra jest podzielna przez $k$,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie liczby całkowite $n$&nbsp;oraz $k$&nbsp;($1 &le; n &le; 1\,000\,000$, $1 &le; k &le; 10^{12}$), oddzielone pojedynczym odstępem. Liczba $n$&nbsp;oznacza moc (liczbę element&oacute;w) zbioru $A$. Drugi wiersz wejścia zawiera $n$&nbsp;liczb całkowitych $a_i$&nbsp;($1 &le; a_i &le; 10^{18}$), pooddzielanych pojedynczymi odstępami i oznaczających elementy zbioru $A$. Liczby $a_i$&nbsp;są parami r&oacute;żne.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać w pierwszym i jedynym wierszu wyjścia jedną liczbę całkowitą, będącą najmniejszą liczbą dodatnią niewystępującą w zbiorze $A$, podzielną przez $k$.</p>
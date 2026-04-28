# [Bronze I] Bałagan i Stonki - 8538

[문제 링크](https://www.acmicpc.net/problem/8538)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 109, 정답: 100, 맞힌 사람: 91, 정답 비율: 92.857%

### 분류

자료 구조, 문자열, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Przewodniczący Stonkony chce się dowiedzieć z ilu członk&oacute;w składa się jego organizacja. Zarządził, aby wszyscy członkowie wpisali się na listę obecności. Stonki są mało inteligentne, więc część z nich wpisała się na listę wielokrotnie. Na domiar złego nie potrafią dobrze pisać: mylą się im małe i wielkie litery oraz często wpisują znak <code>-</code>&nbsp;(minus). Pom&oacute;ż Przewodniczącemu dowiedzieć się, jak duża jest jego organizacja.</p>

<p>Mając daną listę z wpisami (jeden wpis w jednym wierszu) policz, ile r&oacute;żnych nazwisk się na niej znajduje. To samo nazwisko może się pojawić na liście wiele razy. Nazwiska składają się tylko z wielkich liter alfabetu angielskiego i mają co najwyżej 20 znak&oacute;w. Swoje nazwisko stonka może zapisać:</p>

<ul>
	<li>zamieniając niekt&oacute;re wielkie litery na małe,</li>
	<li>wstawiając w dowolne miejsce dowolnie dużo znak&oacute;w&nbsp;<code>-</code>&nbsp;(minus).</li>
</ul>

<p><b>Przykład</b>: zapisy <code>A-b</code>&nbsp;oraz <code>--A-B-</code>&nbsp;przedstawiają to samo nazwisko.</p>

### 입력

<p>W pierwszym wierszu podana jest liczba wpis&oacute;w <em>j</em>, 1 &le; <em>j</em> &le; 10000. W każdym z kolejnych <em>j</em>&nbsp;wierszy podany jest jeden wpis z listy (nie ma ograniczenia na długość tego wpisu, ale wiadomo, że co najwyżej 20&nbsp;znak&oacute;w jest r&oacute;żnych od&nbsp;<code>-</code>).</p>

### 출력

<p>W pierwszym i jedynym wierszu program powinien wypisać liczbę r&oacute;żnych nazwisk znajdujących się na liście.</p>
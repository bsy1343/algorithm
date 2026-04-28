# [Gold II] Mrówki - 31693

[문제 링크](https://www.acmicpc.net/problem/31693)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 12, 맞힌 사람: 10, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 애드 혹, 누적 합

### 문제 설명

<p>Na osi liczbowej stoi $n$ mr&oacute;wek &ndash; $i$-ta z nich w punkcie $i$. Każda z mr&oacute;wek patrzy w prawo (w kierunku rosnących wsp&oacute;łrzędnych) lub w lewo (w kierunku malejących wsp&oacute;łrzędnych). Mr&oacute;wki są na tyle małe, że możemy traktować je jak pojedyncze punkty.</p>

<p>Na sygnał wszystkie mr&oacute;wki zaczynają z jednakową, jednostkową prędkością maszerować w kierunkach w kt&oacute;re patrzą. Jeśli dwie mr&oacute;wki się zderzą (znajdą się w tym samym punkcie), to odbijają się od siebie, tzn. obie zmieniają kierunek marszu i maszerują dalej. Można udowodnić, że po pewnym czasie nie będą już więcej następować żadne zderzenia. Czy jesteś w stanie napisać program, kt&oacute;ry dla każdej mr&oacute;wki obliczy ile razy odbije się od innych mr&oacute;wek?</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajduje się jedna liczba całkowita $n$ ($1 &le; n &le; 300\, 000$), oznaczająca liczbę mr&oacute;wek.</p>

<p>W drugim wierszu standardowego wejścia znajduje się słowo długości n składające się jedynie ze znak&oacute;w &lsquo;<code>L</code>&rsquo; oraz &lsquo;<code>P</code>&rsquo;. Jeśli $i$-ta litera tego słowa to &lsquo;<code>L</code>&rsquo;, to $i$-ta mr&oacute;wka początkowo patrzy w lewo. W przeciwnym razie, gdy ta litera to &lsquo;<code>P</code>&rsquo;, mr&oacute;wka ta patrzy w prawo.</p>

### 출력

<p>W jedynym wierszu standardowego wyjścia powinno znaleźć się $n$ liczb oddzielonych pojedynczymi odstępami. $i$-ta z tych liczb powinna być r&oacute;wna liczbie odbić $i$-tej mr&oacute;wki.</p>

### 힌트

<p>Wyjaśnienie przykładu: Pierwsza mr&oacute;wka patrzy początkowo w lewo i nigdy nie odbije się od żadnej innej. Ostatnia mr&oacute;wka zderzy się z piątą mr&oacute;wką w punkcie 5.5, po czym zacznie maszerować w prawo i już nigdy nie skończy. Trzecia mr&oacute;wka, po odbiciu się od czwartej w punkcie 3.5, zacznie iść w lewo. Druga mr&oacute;wka odbije się od niej w punkcie 3, po czym obr&oacute;ci się w lewo i nigdy nie przestanie maszerować.</p>
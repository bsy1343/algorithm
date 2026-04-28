# [Bronze I] Hurtownia - 8620

[문제 링크](https://www.acmicpc.net/problem/8620)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 145, 정답: 101, 맞힌 사람: 87, 정답 비율: 70.732%

### 분류

구현, 자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Szef Twojego kolegi, kt&oacute;ry pracuje w hurtowni, dzisiaj zachorował, a oto kontrola stoi u drzwi! Potrzebuje on więc możliwie szybko poznać liczbę pudeł poszczeg&oacute;lnych towar&oacute;w, jakie są aktualnie przechowywane w hurtowni. Korzystając z okazji, że odwiedziłeś go w pracy, Tw&oacute;j kolega poprosił Cię, żebyś pom&oacute;gł mu to policzyć.</p>

<p>Na szczęście nie musisz liczyć pudeł ręcznie, gdyż chorujący szef zostawił swoje notatki, w kt&oacute;rych skrupulatnie notował każdy transport towar&oacute;w, zar&oacute;wno przywożonych, jak i wywożonych z hurtowni. Zapiski te leżą teraz przed Tobą - wszystkie od samego początku pracy hurtowni.</p>

<p>Oblicz, ile jest w tym momencie pudeł na składzie.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia spis transport&oacute;w magazynowanych pudeł,</li>
	<li>wyznaczy aktualną liczbę pudeł każdego z rodzaj&oacute;w towaru na składzie,</li>
	<li>wypisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>Pierwszy wiersz wejścia zawiera jedną liczbę całkowitą $n$&nbsp;($1 &le; n &le; 1\,000\,000$), oznaczającą liczbę zapisk&oacute;w w notatkach. W każdym z kolejnych $n$&nbsp;wierszy znajduje się pojedynczy zapis, dotyczący jednego transportu i składający się kolejno z:</p>

<ul>
	<li>rodzaju towaru, kt&oacute;rego ten zapis dotyczy (poszczeg&oacute;lne towary są oznaczone wielkimi literami alfabetu angielskiego od $A$&nbsp;do $Z$);</li>
	<li>pojedynczego odstępu;</li>
	<li>znaku &quot;$+$&quot; lub &quot;$-$&quot; (&quot;$+$&quot; oznacza, że pudła zostały przywiezione do hurtowni, zaś &quot;$-$&quot; - że zostały z niej wywiezione);</li>
	<li>pojedynczej dodatniej liczby całkowitej, nie większej niż $2\,000$&nbsp;i oznaczającej liczbę pudeł, kt&oacute;re zostały przetransportowane.</li>
</ul>

<p>Zakładamy, że przed pierwszym transportem magazyn był pusty. Możesz też założyć, że nigdy w hurtowni nie było ujemnej liczby pudeł żadnego towaru.</p>

### 출력

<p>Wyjście powinno zawierać po jednym wierszu dla każdego rodzaju towaru, kt&oacute;ry pojawił się na wejściu. Każdy taki wiersz powinien zawierać nazwę towaru (oznaczoną za pomocą pojedynczej wielkiej litery) i oddzieloną od niej pojedynczym odstępem liczbę pudeł tego towaru, kt&oacute;re znajdują się aktualnie w hurtowni. Towary na wyjściu powinny być wymienione w kolejności alfabetycznej.</p>
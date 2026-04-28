# [Platinum IV] Kuglarz - 10138

[문제 링크](https://www.acmicpc.net/problem/10138)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 9, 정답: 7, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

그래프 이론, 최소 스패닝 트리

### 문제 설명

<p><i>Hej, ludzie! Cuda w tej budzie! Chyba zwariowałem, pieniądze rozdaję!</i>&nbsp;- Bitocy zarabia na życie jako kuglarz na jarmarku w Bajtowej.</p>

<p>Zaprasza przechodni&oacute;w do specyficznej zabawy. Na stoliku w rzędzie stoi n&nbsp;kubk&oacute;w z numerami 1, 2, ..., n, pod niekt&oacute;rymi schowane są kauczukowe kulki. Jeśli grający dokładnie odgadnie, kt&oacute;re to kubki, to dostaje wielkiego pluszowego misia. Bitocy odpłatnie udziela grającemu podpowiedzi. Za c<sub>ij</sub>&nbsp;bajtogroszy Bitocy got&oacute;w jest zdradzić, jaka jest parzystość liczby kulek schowanych pod kubkami o numerach i, i+1, ..., j.</p>

<p>Bajtazar przyszedł na jarmark z Bajtyną - najładniejszą panną w całej Bajtowej. Bardzo chciałby wygrać dla niej misia. Nie zamierza przy tym narażać się na kompromitację i zgadywać, nie będąc pewnym odpowiedzi. Będzie płacił za podpowiedzi tak długo, aż zebrane informacje pozwolą mu ustalić z całą pewnością, pod kt&oacute;rymi kubkami znajdują się kulki.</p>

<p>Znając ceny wszystkich możliwych podpowiedzi, zastanawia się teraz, ile maksymalnie będzie go to kosztować. Ściślej rzecz biorąc, chciałby znać najmniejszą taką liczbę k, że istnieje strategia zadawania pytań, kt&oacute;ra niezależnie od odpowiedzi Bitocego pozwala na zlokalizowanie kulek za co najwyżej k&nbsp;bajtogroszy.</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera jedną liczbę całkowitą n&nbsp;(1 &le; n &le; 2000), oznaczającą liczbę kubk&oacute;w. Po nim następuje opis koszt&oacute;w zapytań o poszczeg&oacute;lne przedziały. W (i+1)-szym wierszu wejścia (dla 1 &le; i &le; n) znajduje się n+1-i&nbsp;liczb całkowitych, oznaczających koszty poszczeg&oacute;lnych podpowiedzi.</p>

<p>Koszt c<sub>ij</sub>&nbsp;(1 &le; i &le; j &le; n, 1 &le; c<sub>ij</sub> &le; 10<sup>9</sup>) zapytania o przedział od i-tego do j-tego kubka włącznie pojawia się na wejściu jako (j+1-i)-ta liczba w (i+1)-szym wierszu.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać jedną liczbę całkowitą będącą maksymalnym kosztem ustalenia położenia kulek dla optymalnej strategii zadawania pytań.</p>
# [Platinum III] Bardzo Ulubiony Ciąg - 31706

[문제 링크](https://www.acmicpc.net/problem/31706)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 3, 맞힌 사람: 3, 정답 비율: 37.500%

### 분류

누적 합

### 문제 설명

<p>3SUM to znany problem algorytmiczny, w kt&oacute;rym dla danego ciągu liczb całkowitych c<sub>1</sub>, c<sub>2</sub>, . . . , c<sub>m</sub> należy znaleźć trzy indeksy i &lt; j &lt; k takie, że c<sub>i</sub> + c<sub>j</sub> + c<sub>k</sub> = 0.</p>

<p>Nie jest znane rozwiązanie tego problemu dla dowolnych ciąg&oacute;w liczb całkowitych w złożoności istotnie lepszej niż O(m<sup>2</sup>). Na szczęście Bajtek tego nie wie i postanowił rozwiązać ten problem dla swojego Bardzo Ulubionego Ciągu.</p>

<p>Ulubiony Ciąg Bajtka składa się z n liczb całkowitych a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub>. Bardzo Ulubiony Ciąg Bajtka powstaje poprzez spojrzenie na wszystkie n(n+1)/2 sp&oacute;jnych przedział&oacute;w Ulubionego Ciągu Bajtka, obliczenie sum element&oacute;w w nich i umieszczenie wszystkich tych sum w jednym ciągu (uwzględniając powt&oacute;rzenia). Sumy przedział&oacute;w układamy w kolejności rosnącej po indeksie początku przedziału, a w przypadku remisu w kolejności rosnącej po indeksie końca przedziału.</p>

<p>Żeby nie było za prosto, Bajtka nie interesuje znalezienie tr&oacute;jki indeks&oacute;w i &lt; j &lt; k. Chciałby on poznać dokładną liczbę wszystkich tr&oacute;jek indeks&oacute;w i &lt; j &lt; k odpowiadających elementom, kt&oacute;re sumują się do zera. Pom&oacute;ż mu i napisz program, kt&oacute;ry obliczy dla niego liczbę takich tr&oacute;jek!</p>

### 입력

<p>W pierwszym wejściu standardowego wejścia znajduje się liczba całkowita n (1 &le; n &le; 500), oznaczająca długość Ulubionego Ciągu Bajtka.</p>

<p>W kolejnym znajduje się n liczb całkowitych a<sub>i</sub> (|a<sub>i</sub>| &le; 20 000), oznaczających kolejne elementy Ulubionego Ciągu Bajtka.</p>

### 출력

<p>W pierwszym i jedynym wierszu standardowego wyjścia powinna znaleźć się jedna liczba całkowita &ndash; liczba tr&oacute;jek indeks&oacute;w i &lt; j &lt; k odpowiadających wyrazom Bardzo Ulubionego Ciągu Bajtka, kt&oacute;re sumują się do 0.</p>

### 힌트

<p>Wyjaśnienie przykładu: W pierwszym teście przykładowym Bardzo Ulubiony Ciąg to [7, 3, 1, &minus;4, &minus;6, &minus;2], a jedyną tr&oacute;jką r&oacute;żnych element&oacute;w sumujących się do 0 jest 3 + 1 + (&minus;4), stąd odpowiedzią jest 1.</p>

<p>W drugim teście przykładowym Bardzo Ulubiony Ciąg Bajtka składa się z pięćdziesięciu pięciu zer. Dla dowolnych trzech indeks&oacute;w i &lt; j &lt; k suma odpowiadających im element&oacute;w jest r&oacute;wna 0, a takich tr&oacute;jek jest 26 235.</p>
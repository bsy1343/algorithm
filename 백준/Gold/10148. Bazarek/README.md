# [Gold I] Bazarek - 10148

[문제 링크](https://www.acmicpc.net/problem/10148)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 256 MB

### 통계

제출: 12, 정답: 6, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

정렬, 누적 합, 홀짝성

### 문제 설명

<p>Mały Bajtek spędza wakacje u babci Bajtuli. Codziennie rano babcia idzie na bazarek, by zakupić pewne produkty. Chłopiec szybko zauważył ciekawą prawidłowość: każdego dnia babcia wydaje na zakupy kwotę wyrażającą się nieparzystą liczbą całkowitą. Bajtek wkr&oacute;tce ustalił, iż dostrzeżona prawidłowość jest cechą charakterystyczną wszystkich bajtockich babć.</p>

<p>Każdego dnia babcia Bajtula kupuje po co najwyżej jednym egzemplarzu każdego z <em>n</em>&nbsp;produkt&oacute;w dostępnych na bazarku. Babcia w swej zapobiegliwości nie chce brać na zakupy zbyt dużej sumy pieniędzy. Kt&oacute;regoś dnia poprosiła Bajtka o wskaz&oacute;wkę, ile pieniędzy musi ze sobą zabrać, jeśli tego dnia chce kupić na bazarku dokładnie <em>k</em> produkt&oacute;w. Niestety Bajtek nie wie, kt&oacute;re produkty babcia zamierza kupić, więc zabrana kwota musi wystarczyć na dowolne <em>k</em>&nbsp;produkt&oacute;w (tak żeby suma ich koszt&oacute;w była nieparzysta). Ta sama sytuacja powt&oacute;rzyła się kilkukrotnie. Bajtek postanowił więc podejść do sprawy metodycznie i napisać program, kt&oacute;ry mając do dyspozycji ceny wszystkich produkt&oacute;w dostępnych na bazarku, będzie odpowiadał na pytania babci.</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 1 000 000) oznaczającą liczbę produkt&oacute;w dostępnych na bazarku. Drugi wiersz zawiera <em>n</em>&nbsp;liczb całkowitych z zakresu [1, 10<sup>9</sup>], oznaczających ceny poszczeg&oacute;lnych produkt&oacute;w. W trzecim wierszu znajduje się jedna liczba całkowita <em>m</em>&nbsp;(1 &le; <em>m</em> &le; 1 000 000) oznaczająca liczbę dni, kt&oacute;re Bajtek spędzi jeszcze u babci. Każdy z kolejnych <em>m</em>&nbsp;wierszy zawiera jedną liczbę całkowitą <em>k<sub>i</sub></em>&nbsp;(1 &le; <em>k<sub>i</sub></em> &le; <em>n</em>), oznaczającą liczbę produkt&oacute;w, kt&oacute;re danego dnia zamierza kupić babcia.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na wyjście <em>m</em>&nbsp;wierszy. W <em>i</em>-tym wierszu (dla <em>i</em> = 1, ..., <em>m</em>) powinna znaleźć się jedna liczba całkowita, oznaczająca maksymalną nieparzystą cenę <em>k<sub>i</sub></em>&nbsp;produkt&oacute;w. Jeśli nie da się wybrać <em>k<sub>i</sub></em>&nbsp;produkt&oacute;w, kt&oacute;rych łączna cena byłaby nieparzysta, w <em>i</em>-tym wierszu wyjścia powinna znaleźć się liczba -1.</p>
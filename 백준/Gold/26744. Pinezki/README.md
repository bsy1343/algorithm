# [Gold IV] Pinezki - 26744

[문제 링크](https://www.acmicpc.net/problem/26744)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 10, 맞힌 사람: 10, 정답 비율: 71.429%

### 분류

수학, 재귀

### 문제 설명

<p>Bajtosia wbija pinezki w oś liczbową &ndash; dokładniej m&oacute;wiąc, wybiera sobie pewne N i wbija pinezki w sw&oacute;j ulubiony odcinek [0, 3<sup>N</sup>] na osi. Pierwsze dwie pinezki trafiają na na początek i koniec odcinka, a następnie Bajtosia działa według następującego planu:</p>

<p>Najpierw wbija nowe pinezki w jednej trzeciej długości od początku swojego odcinka oraz w jednej trzeciej długości od końca. Tak wyznaczone punkty dzielą odcinek na trzy części r&oacute;wnej długości: lewą, środkową i prawą. Następnie Bajtosia powtarza cały proces najpierw dla części lewej (jej początek i koniec już ma zaznaczony), a potem dla części prawej (ale nie dla środkowej!). Po drodze w obu tych częściach pojawią się mniejsze części, w kt&oacute;rych Bajtosia będzie znowu powtarzać sw&oacute;j plan, i tak dop&oacute;ki się da &ndash; ponieważ Bajtosia wbija pinezki tylko w punkty całkowite, nie będzie już dalej dzielić odcink&oacute;w, kt&oacute;re mają długość 1.</p>

<p>Końcowy układ pinezek otrzymany przez Bajtosię nazywa się fraktalem<sup>1</sup>.</p>

<p>Przykładowo, jeśli N = 3, na odcinku zaznaczone będą następujące punkty:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26744.%E2%80%85Pinezki/9655cb2f.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/26744.%E2%80%85Pinezki/9655cb2f.png" data-original-src="https://upload.acmicpc.net/50147f5b-5612-42a8-b76c-80270b4cec50/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 630px; height: 28px;" /></p>

<p>Bajtosia zastanawia się czy się nie pomyliła, sprawdzając dla r&oacute;żnych K pozycję K-tej pinezki od lewej. Pomożesz jej?</p>

<p>Napisz program, kt&oacute;ry wczyta wartość N oraz zapytania Bajtosi i dla każdego zapytania K<sub>i</sub> wyznaczy, gdzie leży K<sub>i</sub>-ta pinezka.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 36). W drugim wierszu wejścia znajduje się jedna liczba naturalna Q (1 &le; Q &le; 200 000) określająca liczbę zapytań Bajtosi. W kolejnych Q wierszach znajduje się opis kolejnych zapytań, po jednym w wierszu. Opis każdego zapytania składa się z jednej liczby K<sub>i</sub> (1 &le; K<sub>i</sub> &le; 10<sup>18</sup>) określającej zapytanie Bajtosi jaka jest pozycja K<sub>i</sub>-tej od lewej pinezki wbitej na jej odcinku. Wbite przez Bajtosię pinezki numerujemy kolejnymi liczbami naturalnymi zaczynając od 1.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać dokładnie Q wierszy. W i-tym wierszu powinna się znaleźć odpowiedź dla i-tego zapytania Bajtosi &ndash; pozycja K<sub>i</sub>-tej pinezki na odcinku. Jeżeli Bajtosia wbiła mniej niż K<sub>i</sub> pinezek, zamiast tego należy wypisać (dla tego zapytania) odpowiedź <code>NIE</code>.</p>
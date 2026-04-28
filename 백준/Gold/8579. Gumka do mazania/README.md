# [Gold IV] Gumka do mazania - 8579

[문제 링크](https://www.acmicpc.net/problem/8579)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 11, 맞힌 사람: 8, 정답 비율: 72.727%

### 분류

그리디 알고리즘

### 문제 설명

<p>Bitek ma już dość swojego imienia. Jest z jego powodu zawsze wyczytywany w dzienniku jako jeden z pierwszych, a przecież wiadomo, że żaden rozsądny uczeń nie pali się do odpowiedzi.</p>

<p>Ale... od dzisiaj wszystko się zmieni. Kiedy ktoś zw&oacute;rci się do chłopca &quot;Bitek&quot;, ten wręczy mu wizyt&oacute;wkę ze swym nowym imieniem. Problem jednak w tym, że złamał się jednyny oł&oacute;wek chłopca, więc jedyne co może zrobić, to zebrać wszystkie kartki, na kt&oacute;rych kiedyś wypisał r&oacute;żne głupstwa i usunąć z nich za pomocą gumki niekt&oacute;re litery.</p>

<p>Oczywiście na wszystkich wizyt&oacute;wkach powinno widnieć to samo imię i należy wykorzystać wszystkie możliwe kartki, bo nie może dojść do sytuacji, w kt&oacute;rej Już-Nie-Bitkowi zabraknie wizyt&oacute;wek. Nowe imię nie musi mieć logicznego sensu. Ważne, żeby znajdowało się jak najbliżej końca listy w dzienniku.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajduje się jedna liczba $N$&nbsp;($1 &le; N &le; 10\,000$), oznaczająca liczbę zapisanych kartek. W kolejnych $N$&nbsp;wierszach znajdują się słowa zapisane na kolejnych kartkach, każde składa się z małych liter alfabetu angielskiego. Sumaryczna długość sł&oacute;w na wejściu nie może przekroczyć $10^7$.</p>

### 출력

<p>Na standardowe wyjście należy wypisać jedno słowo - możliwie ostatnie leksykograficznie imię Bajtka, powstałe przez wymazanie niekt&oacute;rych liter z kartek, przy czym, jeśli takie imię byłoby mniejsze leksykograficznie niż &quot;<code>bitek</code>&quot;, chłopiec zrezygnuje z pomysłu i pozostanie przy swoim dawnym imieniu, należy więc wypisać &quot;<code>bitek</code>&quot;.</p>
# [Gold IV] Hurtownia czekolady - 7945

[문제 링크](https://www.acmicpc.net/problem/7945)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 15, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

수학, 다이나믹 프로그래밍, 확률론

### 문제 설명

<p>Syn prof. J. jest z wykształcenie informatykiem. Spędzał on tak dużo czasu przed monitorem, że doznał zwichnięcia gałek ocznych i musiał się przekwalifikować. Teraz pracuje jako magazynier w hurtowni czekolad. Jakiś czas temu, jedna z firm produkująca czekolady ogłosiła promocję. Polega ona na tym, że w niekt&oacute;rych tabliczkach czekolady znajdują się niespodzianki. Producent czekolad dołożył wszelkich starań, żeby nie można było stwierdzić, czy w danej tabliczce czekolady ukryta jest niespodzianka czy nie. I rzeczywiście, na pierwszy rzut oka tego nie widać, ale syn prof. J. przeprowadził bardzo szczeg&oacute;łową analizę czekolad produkowanych przez tego producenta, dzięki czemu dla każdej czekolady jest w stanie określić prawdopodobieństwo, że w środku jest niespodzianka. Syn prof. J. wie jaka jest wartość niespodzianek w czekoladach oraz zna cenę samej czekolady. Potrafiłby więc łatwo policzyć, czy opłaca mu się kupić daną czekoladę czy nie. Niestety, czekolady do hurtowni przychodzą w kartonach pakowanych po n czekolad. Syn prof. J. może taki karton rozpakować i dla każdej czekolady określić prawdopodobieństwo tego, że w środku jest niespodzianka, ale nie może kupić pojedynczej czekolady, lecz jedynie cały karton &mdash; w końcu jest to hurtownia. Syn prof. J. policzył sobie, że żeby inwestycja z zakupu kartonu czekolad zwr&oacute;ciła się, w kartonie musi znaleźć przynajmniej k niespodzianek. W związku z tym, chciałby on znać prawdopodobieństwo takiego zdarzenia. Niestety, tego obliczyć już nie potrafi.</p>

<p>Syn prof. J. jest Twoim dobrym kolegą z czas&oacute;w studi&oacute;w. Jesteś zdrowym informatykiem, bo nie spędziłeś tyle czasu przed monitorem, więc syn prof. J. poprosił Cię o pomoc. Oblicz prawdopodobieństwo, że w kartonie z n czekoladami znajduje się co najmniej k niespodzianek.</p>

### 입력

<p>W pierwszej linii znajduje się liczba naturalna d (1 &le; d &le; 100), określająca liczbę test&oacute;w.</p>

<p>Pierwsza linia testu zawiera liczby n, k (1 &le; n &le; 10000; 0 &le; k &le; n). W drugiej linii testu znajduje się n liczb rzeczywistych, będących prawdopodobieństwami, że dana czekolada zawiera niespodziankę. Prawdopodobieństwa są podane z dokładnością do czwartego miejsca po przecinku.</p>

### 출력

<p>Dla każdego testu wypisz w osobnej linii prawdopodobieństwo, że w kartonie z n czekoladami znajduje się co najmniej k niespodzianek. Wynik zaokrąglij do czwartego miejsca po przecinku.</p>
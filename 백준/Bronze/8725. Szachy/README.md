# [Bronze III] Szachy - 8725

[문제 링크](https://www.acmicpc.net/problem/8725)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 678, 정답: 340, 맞힌 사람: 304, 정답 비율: 49.673%

### 분류

구현

### 문제 설명

<p>Tatuś małego Pawełka jest znanym na świecie arcymistrzem szachowym i bardzo chciałby, żeby jego synek podążył jego śladami. Dlatego zaczął go już uczyć grać w szachy, mimo młodego wieku chłopca. Niestety Pawełkowi kiepsko idzie nauka, najwyraźniej nie ma do tego smykałki.</p>

<p>Przez pierwsze trzy dni uczył się ruch&oacute;w pionka, a przez następne 8 - ruch&oacute;w skoczka (po jednym dniu na każdy ruch). Aktualnie uczy się ruch&oacute;w wieży, z kt&oacute;rą radzi sobie dużo lepiej i szacuje się, że po drugim dniu opanuje w pełni jej możliwości. W każdym razie po pierwszym dniu Pawełek umie już poruszać się nią w poziomie.</p>

<p>Chłopiec jeszcze nie wie, jaka lekcja go czeka następnego dnia, więc jest święcie przekonany, że wieżę można przesunąć na dowolne pole w tym samym wierszu i na żadne inne. Choć Pawełek nie radzi sobie za dobrze z szachami to ma smykałkę do matematyki.</p>

<p>Wymyślił więc sobie własną zabawę, na podstawie nowo zdobytej wiedzy. Narysował sobie szachownicę (niekoniecznie o wymiarach 8x8, ale kwadratową) i powypisywał na jej polach r&oacute;żne liczby, po jednej na każdym polu. Następnie zaczął stawiać na polach wieże tak, aby suma liczb na polach zajętych przez nie była możliwie jak największa. Chłopiec może postawić dowolną liczbę wież (w razie czego pożyczy sobie z innego zestawu, kt&oacute;rych w domu ma pełno); gdy nie postawi ani jednej, przyjmuje się, że suma jest r&oacute;wna O. Żeby zabawa nie była zbyt prosta, trzyma się reguły, że żadne dwie wieże nie mogą stać na jednym polu ani wzajemnie siebie atakować (według jego aktualnego stanu wiedzy o szachach).</p>

<p>Mając daną wielkość szachownicy oraz liczby, jakie Pawełek powpisywał w pola szachownicy, podaj, jaką największą sumę może uzyskać, stawiając wieże zgodnie z podanymi regułami.</p>

### 입력

<p>W pierwszym wierszu znajduje się jedna liczba całkowita <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 200), m&oacute;wiąca jaka jest wysokość i szerokość szachownicy. W kolejnych&nbsp;<em>n</em>&nbsp;wierszach opisu przedstawiona jest zawartość p&oacute;l w kolejnych wierszach szachownicy. Tak więc w wierszu <em>i</em>-tym (spośr&oacute;d tych <em>n</em>) znajduje się&nbsp;<em>n</em>&nbsp;liczb całkowitych (z przedziału od -1 000 000&nbsp;do 1 000 000), będących wartościami zapisanymi w kolejnych polach <em>i</em>-tego wiersza szachownicy.</p>

### 출력

<p>Należy wypisać jedną liczbę całkowitą - maksymalną sumę, jaką chłopiec może uzyskać.</p>
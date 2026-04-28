# [Platinum III] Kaktus - 8852

[문제 링크](https://www.acmicpc.net/problem/8852)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 37, 정답: 14, 맞힌 사람: 10, 정답 비율: 40.000%

### 분류

그래프 이론, 이중 연결 요소, 선인장

### 문제 설명

<p><em>Prędzej mi kaktus na dłoni wyrośnie, niż podejmę się takiego zadania!</em>&nbsp;- zawołał Witek. Chłopcy po zakończeniu eksperymentu z mr&oacute;wkami zajęli się analizą graf&oacute;w (nieskierowanych). Witkowi w przydziale zadań przypadł obowiązek liczenia, ile r&oacute;żnych cykli (prostych, czyli bez powtarzających się wierzchołk&oacute;w) znajduje się w zadanym grafie. Witek uważa to zadanie za zdecydowanie zbyt pracochłonne i stąd jego okrzyk protestu.</p>

<p>Po pewnym czasie chłopcom udało się dojść do porozumienia - zadanie Witka pozostanie wprawdzie niezmienione, ale chłopcy ograniczą się do badania graf&oacute;w w kt&oacute;rych policzyć cykle powinno być stosunkowo łatwo. A dokładniej do takich graf&oacute;w, w kt&oacute;rych dowolne dwa r&oacute;żne cykle mają co najwyżej jeden wsp&oacute;lny wierzchołek.</p>

<p>Pom&oacute;ż Witkowi w wykonywaniu jego pracy. Jeżeli okaże się, że zadany graf nie spełnia założenia, odm&oacute;w wykonania zadania.</p>

### 입력

<p>W pierwszej linii znajduje się jedna liczba naturalna L, oznaczająca liczbę zestaw&oacute;w danych. Następnie następuje opis kolejnych zestaw&oacute;w.</p>

<p>W pierwszej linii opisu znajdują się dwie liczby naturalne N i M (1&lt;= N,M &lt;= 1000000), oznaczające - odpowiednio - liczbę wierzchołk&oacute;w i liczbę krawędzi grafu. Następnie podawany jest opis krawędzi grafu w M kolejnych liniach. Każda z nich zawiera dwie r&oacute;żne liczby naturalne A i B oznaczające wierzchołki, kt&oacute;re łączy dana krawędź (numerowane od 0). Krawędzie będą parami r&oacute;żne.</p>

### 출력

<p>Dla każdego zestawu w osobnej linii należy wypisać liczbę cykli w grafie, jeśli ten spełnia opisane w treści założenie, lub &quot;NIE&quot; w przeciwnym przypadku.</p>
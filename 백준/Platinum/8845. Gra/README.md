# [Platinum III] Gra - 8845

[문제 링크](https://www.acmicpc.net/problem/8845)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 20, 정답: 16, 맞힌 사람: 14, 정답 비율: 82.353%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 깊이 우선 탐색, 게임 이론, 방향 비순환 그래프, 위상 정렬, 스프라그–그런디 정리

### 문제 설명

<p>Hektor bardzo lubi grać ze Zbyszkiem w gry planszowe.&nbsp;Plansza do takiej gry składa się z p&oacute;l oraz jednokierunkowych krawędzi łączących pola. Wszystkie gry Hektora mają wsp&oacute;lną własność - w żadnej podążając wzdłuż jej krawędzi nie da się przejść dwa razy przez to samo pole.</p>

<p>Niestety, chłopcy znają już wszystkie gry Hektora tak dobrze, że zabawa nie sprawa im już przyjemności. Hektor wpadł na pomysł odświeżenia ich ulubionej rozrywki.</p>

<p>Pomysł Hektora jest następujący - chłopak wybiera ze swojej kolekcji dwie plansze (do dw&oacute;ch, być może r&oacute;żnych gier) i na każdej stawia pionek. Następnie Hektor na zmianę ze Zbyszkiem wykonują ruchy. Ruch polega na przesunięciu jednego z pionk&oacute;w wzdłuż istniejącej krawędzi planszy, na kt&oacute;rej się znajduje. Hektor zaczyna.</p>

<p>Jeśli kt&oacute;ryś z graczy nie może wykonać ruchu (oba pionki znajdują się na polach, z kt&oacute;rych nie wychodzą żadne krawędzie), przegrywa grę.</p>

<p>Hektor zastanawia się jakie ustawienia początkowe dadzą mu zwycięstwo, jeśli obaj gracze nie będą popełniać żadnych błęd&oacute;w.</p>

### 입력

<p>Wejście programu zaczyna się od opis&oacute;w dw&oacute;ch plansz do gry, podanych jeden za drugim.</p>

<p>Opis każdej planszy zaczyna się od dw&oacute;ch liczb naturalnych N i M ( 1 &lt;= N, M &lt;= 100000 ) oznaczających, odpowiednio, liczbę p&oacute;l i liczbę krawędzi planszy. W kolejnych M liniach znajdują się opisy krawędzi planszy, każdy z nich stanowi para liczb naturalnych A, B oznaczająca istnienie ścieżki z pola A do pola B. Pola numerujemy od 1 do N.</p>

<p>Po opisie obu plansz na wejściu znajduje się liczba naturalna Q ( 1 &lt;= Q &lt;= 100000) oznaczająca liczbę początkowych konfiguracji, kt&oacute;re Hektor chce poddać analizie. W każdej z kolejnych Q linii znajduje się para liczb X, Y oznaczająca, że w danym ustawieniu początkowym jeden pionek znajduje się na polu nr X pierwszej planszy, a drugi na polu nr Y drugiej.</p>

### 출력

<p>Dla każdej konfiguracji początkowej w osobnej linii wypisz &quot;W&quot;, jeśli Hektor wygra grę przy danym ustawieniu, &quot;P&quot; w przeciwnym przypadku.</p>
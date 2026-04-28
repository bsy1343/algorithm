# [Platinum II] Budowa - 10149

[문제 링크](https://www.acmicpc.net/problem/10149)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 17, 정답: 1, 맞힌 사람: 1, 정답 비율: 10.000%

### 분류

다이나믹 프로그래밍, 브루트포스 알고리즘, 트리, 트리에서의 다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p>Bajtazar chciałby zbudować w Bajtocji tor wyścigowy. O środki na jego budowę rywalizuje z Bajtymonem, kt&oacute;ry wolałby zbudować skocznię narciarską. Obydwa projekty są kosztowne, dlatego Bajtazar i Bajtymon starają się o dofinansowanie kr&oacute;la Bajtocji.</p>

<p>Kr&oacute;l musi teraz wybrać jedną z dw&oacute;ch opcji: albo dofinansuje tor wyścigowy, albo skocznię narciarską. W tym celu zapyta o zdanie Naczelnego Doradcę, kt&oacute;ry stoi na czele hierarchii doradc&oacute;w kr&oacute;la. Każdy doradca jest albo ekspertem i wydaje rekomendacje samodzielnie, albo kieruje zespołem doradc&oacute;w. Kierownik zespołu doradc&oacute;w rekomenduje decyzję zgodną z opinią większości członk&oacute;w jego zespołu. Szczęśliwie liczba doradc&oacute;w w każdym zespole jest nieparzysta. Tak więc ostateczna decyzja zależy jedynie od tego, co uważają eksperci (czyli doradcy niekierujący żadnym zespołem). Każdy doradca poza Naczelnym Doradcą ma dokładnie jednego zwierzchnika.</p>

<p>Bajtazar i Bajtymon nie czekają bezczynnie. Starają się przekonać ekspert&oacute;w do swoich racji. Nie jest to proste zadanie - przekonanie jednego eksperta zajmuje dokładnie jeden dzień. Gdy ekspert zostanie przekonany, nie zmieni już swojego zdania. Może się zdarzyć, że niekt&oacute;rzy eksperci już na początku mają wyrobione zdanie, kt&oacute;rego nie zmienią.</p>

<p>Każdego dnia o świcie Bajtazar wybiera jednego niezdecydowanego eksperta i udaje się do niego, by go przekonać. Bajtymon nie lubi tak wcześnie wstawać, dlatego eksperta, kt&oacute;rego przekona, wybiera nieco p&oacute;źniej (i przez to traci szanse przekonania eksperta, z kt&oacute;rym rozmawia Bajtazar). Rywale działają tak długo, aż wszyscy eksperci będą mieli wyrobione zdanie. Bajtazar i Bajtymon znają hierarchię doradc&oacute;w kr&oacute;la. Czy Bajtazar może tak zaplanować swoje działania lobbystyczne, by Naczelny Doradca rekomendował budowę toru wyścigowego, niezależnie od tego, jak postępować będzie Bajtymon?</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita <em>n</em>&nbsp;(2 &le; <em>n</em> &le; 1000), oznaczająca liczbę doradc&oacute;w. Doradc&oacute;w numerujemy liczbami od 1&nbsp;do <em>n</em>. Doradca numer 1&nbsp;jest Naczelnym Doradcą. W&nbsp;<em>i</em>-tym z kolejnych <em>n</em>&nbsp;wierszy znajduje się opis <em>i</em>-tego doradcy. Rozpoczyna się on od liczby całkowitej <em>c<sub>i</sub></em>&nbsp;(-2 &le; <em>c<sub>i</sub></em> &le; <em>n</em>). Jeśli <em>c<sub>i</sub></em> &le; 0, to opisywany doradca jest ekspertem (i jego opis składa się jedynie z liczby <em>c<sub>i</sub></em>). Wartości -2, -1&nbsp;i 0&nbsp;oznaczają, że jest on, odpowiednio, za zbudowaniem toru wyścigowego, za zbudowaniem skoczni narciarskiej, niezdecydowany. Gdy <em>c<sub>i</sub></em> &ge; 1, to liczba <em>c<sub>i</sub></em>&nbsp;jest nieparzysta i oznacza, że doradca <em>i</em>&nbsp;kieruje zespołem doradc&oacute;w składającym się z <em>c<sub>i</sub></em>&nbsp;członk&oacute;w. Numery członk&oacute;w zespołu podane są kolejno w dalszej części wiersza. Każdy doradca o numerze większym od 1&nbsp;należy do dokładnie jednego zespołu.</p>

### 출력

<p>Jeśli Bajtazar nie może tak przekonywać ekspert&oacute;w, by Naczelny Doradca zarekomendował budowę toru wyścigowego, na wyjście wypisz jeden wiersz zawierający słowo&nbsp;<code>NIE</code>. W przeciwnym razie, wypisz dwa wiersze. W pierwszym z nich powinno znaleźć się słowo&nbsp;<code>TAK</code>, a następnie liczba całkowita <em>d</em>, kt&oacute;ra oznacza, na ile sposob&oacute;w Bajtazar może wybrać eksperta do przekonania pierwszego dnia, tak aby dalej mieć pewność, że przy podejmowaniu optymalnych decyzji w kolejnych dniach uzyska korzystną rekomendację Naczelnego Doradcy. W drugim wierszu należy wypisać ciąg <em>d</em>&nbsp;numer&oacute;w tych właśnie ekspert&oacute;w, w kolejności&nbsp;<i>rosnącej</i>. Jeśli na samym początku wszyscy eksperci mają wyrobione zdanie (a rekomendacja Naczelnego Doradcy jest korzystna dla Bajtazara), należy wypisać <em>d</em> = 0.</p>
# [Platinum V] Dlaczego oni śpiewają? - 8785

[문제 링크](https://www.acmicpc.net/problem/8785)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 34, 정답: 14, 맞힌 사람: 13, 정답 비율: 52.000%

### 분류

자료 구조, 기하학, 분리 집합

### 문제 설명

<p>Czy wiecie, że wśr&oacute;d rozlicznych mocnych stron Hektora znajduje się także doskonały słuch muzyczny? Czasem jednak staje się to dla niego prawdziwym utrapieniem, gdyż czyni słuchanie fałszujących ludzi szczeg&oacute;lnie nieprzyjemnym doświadczeniem.</p>

<p>Dzisiaj w szkole Hektora odbywa się casting do program&oacute;w&nbsp;<em>Dlaczego oni śpiewają?</em>, oraz&nbsp;<em>Gwiazdy śpiewają pod lodem</em>.&nbsp;Dziedziniec przed szkołą wypełnił się oczekującymi na swoją kolej uczestnikami, z kt&oacute;rych każdy rozgrzewa się fałszując niemiłosiernie.</p>

<p>Czy da się przejść przez dziedziniec tak, aby nie usłyszeć żadnego z fałszujących uczestnik&oacute;w?</p>

<p>Dziedziniec ma kształt prostokąta o wysokości&nbsp;<strong>N</strong>&nbsp;i szerokości&nbsp;<strong>M</strong>. Wyr&oacute;żniamy na nim (<strong>N</strong>+1)*(<strong>M</strong>+1) punkt&oacute;w o wsp&oacute;łrzędnych całkowitych, z punktem (0,0) w lewym g&oacute;rnym rogu i punktem (<strong>N</strong>,<strong>M</strong>) w prawym dolnym rogu.&nbsp;</p>

<p>Na dziedzińcu stoi&nbsp;<strong>K</strong>&nbsp;fałszujących os&oacute;b, każdą opisują wsp&oacute;łrzędne punktu&nbsp;<strong>P<sub>i</sub></strong>, w kt&oacute;rym stoi, oraz zasięg fałszowania, to znaczy promień okręgu o środku w&nbsp;<strong>P<sub>i</sub></strong>&nbsp;w kt&oacute;rym słychać daną osobę.</p>

<p>Fałszujące osoby stoją w punktach o wsp&oacute;łrzędnych całkowitych, ale Hektor (to w końcu jego szkoła i jego dziedziniec!) może poruszać się dowolną nie wychodzącą poza dziedzinieć ścieżką o rzeczywistych wsp&oacute;łrzędnych kolejnych punkt&oacute;w.</p>

<p>Sprawdź, czy istnieje ścieżka o wsp&oacute;łrzędnych rzeczywistych łącząca dowolny punkt na dolnej krawędzi dziedzińca (czyli punkt o wsp&oacute;łrzędnych (<strong>N</strong>,<strong>a</strong>) dla dowolnego rzeczywistego&nbsp;<strong>a</strong>&nbsp;z przedziału od 0 do&nbsp;<strong>M</strong>) z dowolnym punktem na g&oacute;rnej krawędzi (czyli punktem o wsp&oacute;łrzędnych (0,<strong>b</strong>) dla dowolnego rzeczywistego&nbsp;<strong>b</strong>&nbsp;z przedziału od 0 do&nbsp;<strong>M</strong>), kt&oacute;ra nie wychodzi poza obszar dziedzińca i nie przechodzi przez obszary fałszowania żadnej ze śpiewających os&oacute;b.&nbsp;</p>

### 입력

<p>W pierwszej linii wejścia znajduje się jedna liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) oznaczająca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>W pierwszej linii opisu zestawu znajdują się trzy oddzielone spacjami, opisane w treści liczby całkowite&nbsp;<strong>N</strong>,&nbsp;<strong>M</strong>&nbsp;i&nbsp;<strong>K</strong>&nbsp;( 1 &lt;=&nbsp;<strong>N</strong>,&nbsp;<strong>M</strong>&nbsp;&lt;= 1000, 1 &lt;=&nbsp;<strong>K</strong>&nbsp;&lt;= 1000 ). Następnie w&nbsp;<strong>K</strong>&nbsp;kolejnych liniach opisywane są kolejne fałszujące osoby. Każdą opisują trzy oddzielone spacjami liczby całkowite&nbsp;<strong>w<sub>i</sub></strong>,&nbsp;<strong>c<sub>i</sub></strong>,&nbsp;<strong>r<sub>i</sub></strong>&nbsp;( 0 &lt;=&nbsp;<strong>w<sub>i</sub></strong>&nbsp;&lt;=&nbsp;<strong>N</strong>, 0 &lt;=&nbsp;<strong>c<sub>i</sub></strong>&nbsp;&lt;=&nbsp;<strong>M</strong>, 1 &lt;=&nbsp;<strong>r<sub>i</sub></strong>&nbsp;&lt;= 1000 ), gdzie (<strong>w<sub>i</sub></strong>,<strong>c<sub>i</sub></strong>) oznaczają wsp&oacute;łrzędne danej osoby, a&nbsp;<strong>r<sub>i</sub></strong>&nbsp;jej zasięg fałszowania. &nbsp;</p>

### 출력

<p>Dla każdego zestawu testowego należy w osobnej linii wypisać &quot;TAK&quot;, jeśli poszukiwana ścieżka istnieje i &quot;NIE&quot; w przeciwnym wypadku.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8785.%E2%80%85Dlaczego%E2%80%85oni%E2%80%85%C5%9Bpiewaj%C4%85%3F/8bc0769c.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/8785.%E2%80%85Dlaczego%E2%80%85oni%E2%80%85%C5%9Bpiewaj%C4%85%3F/8bc0769c.png" data-original-src="https://upload.acmicpc.net/2936094f-d6bb-446e-84a3-4c45236c75a7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>
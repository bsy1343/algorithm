# [Gold I] Światłowody - 8495

[문제 링크](https://www.acmicpc.net/problem/8495)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 7, 정답: 6, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

자료 구조, 그래프 이론, 트리, 집합과 맵, 최소 공통 조상

### 문제 설명

<p>W Bajtocji uruchomiono właśnie Superszybką Sieć Światłowodową. Łączy ona <em>n</em>&nbsp;dom&oacute;w za pomocą <em>n</em> - 1&nbsp;kabli światłowodowych tak, że pomiędzy każdą parą dom&oacute;w istnieje dokładnie jedno (być może niebezpośrednie) połączenie. Ulubionym zajęciem mieszkańc&oacute;w Bajtocji jest kręcenie amatorskich film&oacute;w przyrodniczych, kt&oacute;re potem umieszczają w Sieci, by pochwalić się nimi swoim przyjaciołom.</p>

<p>Gdy mieszkaniec <em>i</em>-tego domu chce pobrać film o wielkości <em>w</em>&nbsp;megabajt&oacute;w umieszczony przez mieszkańca domu <em>j</em>, musi nawiązać połączenie między domami <em>i</em>&nbsp;oraz <em>j</em>&nbsp;o przepustowości <em>w</em>&nbsp;megabit&oacute;w (Bajtocczanie są bardzo niecierpliwi). W tym celu na kablach leżących na ścieżce między tymi domami należy zarezerwować przepustowość <em>w</em>&nbsp;megabit&oacute;w. Pojedynczy kabel może obsługiwać wiele połączeń, należy jednak pamiętać o tym, że ma on swoją maksymalną przepustowość.</p>

<p>Twoim celem jest napisanie programu, kt&oacute;ry będzie umożliwiał nawiązywanie połączeń w Sieci.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się liczba całkowita <em>n</em>&nbsp;(2 &le; <em>n</em> &le; 100 000) oznaczająca liczbę dom&oacute;w w Bajtocji. W kolejnych&nbsp;<em>n</em>&nbsp;wierszach znajdują się po trzy liczby całkowite <em>a<sub>i</sub></em>, <em>b<sub>i</sub></em>, <em>p<sub>i</sub></em>&nbsp;(1 &le; <em>a<sub>i</sub></em> &lt; <em>b<sub>i</sub></em> &le; <em>n</em>, 1 &le; <em>p<sub>i</sub></em> &le; 1 000 000) oznaczające, że pomiędzy domami <em>a<sub>i</sub></em>&nbsp;oraz&nbsp;<em>b<sub>i</sub></em>&nbsp;istnieje kabel o przepustowości p<em><sub>i</sub></em>&nbsp;megabit&oacute;w.</p>

<p>W następnym wierszu wejścia znajduje się liczba całkowita <em>m</em>&nbsp;(1 &le; <em>m</em> &le; 100 000) oznaczająca liczbę zgłoszeń do Sieci. W kolejnych&nbsp;<em>m</em>&nbsp;wierszach znajdują się po trzy liczby całkowite&nbsp;<em>a<sub>i</sub></em>, <em>b<sub>i</sub></em>, <em>w<sub>i</sub></em>&nbsp;(1 &le; <em>a<sub>i</sub></em> &lt; <em>b<sub>i</sub></em> &le; <em>n</em>, 0 &le; <em>w<sub>i</sub></em> &le; 1 000 000) oznaczające zgłoszenie między domami&nbsp;<em>a<sub>i</sub></em>&nbsp;oraz&nbsp;<em>b<sub>i</sub></em>. Jeśli <em>w<sub>i</sub></em> &gt; 0, to zgłoszenie jest żądaniem nawiązania połączenia o przepustowości&nbsp;<em>w<sub>i</sub></em>&nbsp;megabit&oacute;w (można nawiązać kilka połączeń między daną parą dom&oacute;w). Dla <em>w<sub>i</sub></em> = 0&nbsp;zgłoszenie jest żądaniem przerwania wszystkich dotychczas nawiązanych połączeń między tymi domami.</p>

### 출력

<p>Dla każdego żądania nawiązania połączenia należy wypisać na wyjściu jeden wiersz zawierający słowo&nbsp;<code>TAK</code>&nbsp;lub&nbsp;<code>NIE</code>, w zależności od tego, czy rezerwacja się powiodła.</p>
# [Platinum V] Łańcuchy górskie - 26816

[문제 링크](https://www.acmicpc.net/problem/26816)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

기하학, 그래프 이론, 최소 스패닝 트리

### 문제 설명

<p>Kr&oacute;lestwo Bajtocji jest przepięknym krajem z bardzo osobliwą geografią. Przez kr&oacute;lestwo to biegnie M łańcuch&oacute;w g&oacute;rskich, kt&oacute;re możemy sobie wyobrazić jako proste w układzie wsp&oacute;łrzędnych, kt&oacute;re dzielą kr&oacute;lestwo na regiony.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26816.%E2%80%85%C5%81a%C5%84cuchy%E2%80%85g%C3%B3rskie/1e92ebb5.png" data-original-src="https://upload.acmicpc.net/76eee6ed-79cf-4c97-9bfc-85b9f5926dbc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 330px; height: 329px;" /></p>

<p>Zauważ, że w jednym punkcie może krzyżować się wiele łańcuch&oacute;w g&oacute;rskich. Na szczęście w Bajtocji żadne trzy łańcuchy g&oacute;rskie nie krzyżują się (formalnie: nie przecinają się w jednym punkcie). Może jednak zdarzyć się tak, że jedna g&oacute;ra należy do dw&oacute;ch łańcuch&oacute;w g&oacute;rskich.</p>

<p>Komunikacja w Bajtocji jest zatem bardzo problemowa, jako że gł&oacute;wną metodą poruszania się pomiędzy N miastami jest lot samolotem. Kr&oacute;l Bajtocji chciałby to zmienić, dlatego trwają pracę nad systemem dr&oacute;g i tuneli, tak aby pomiędzy każdą parą miast można było przejechać. Droga pomiędzy dwoma miastami może, ale nie musi przebiegać w linii prostej. Aby zbudować drogę przebiegającą przez K r&oacute;żnych łańcuch&oacute;w g&oacute;rskich, potrzeba zaangażować do tego K ekip budowlanych. Zauważ, że w szczeg&oacute;lności oznacza to, że nawet jeżeli chcemy przeprowadzić drogę poprzez punkt, w kt&oacute;rym krzyżują się dwa łańcuchy g&oacute;rskie, wciąż potrzebujemy do tego dw&oacute;ch ekip budowlanych. Kr&oacute;l chciałby, aby drogi były wybudowane jak najszybciej, dlatego ekipa budowlana może być przydzielona tylko do jednej drogi.</p>

<p>Rozważmy poniższy przykład z trzema miastami (czarne kropki). Możemy zbudować dwie drogi (czerwone linie): jedną pomiędzy miastami 1 i 2, kt&oacute;ra będzie wymagała dw&oacute;ch ekip budowlanych, a drugą pomiędzy miastami 2 i 3, kt&oacute;ra będzie wymagała jednej ekipy. Zauważ, że pomiędzy miastami 1 i 3 nie ma bezpośredniej drogi, ale jest droga pośrednia przez miasto 2.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26816.%E2%80%85%C5%81a%C5%84cuchy%E2%80%85g%C3%B3rskie/f612e22a.png" data-original-src="https://upload.acmicpc.net/5f36a1bc-cb75-4124-a7d3-5ed5112836cc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 330px; height: 333px;" /></p>

<p>Twoim zadaniem jest policzenie ile minimalnie ekip budowlanych jest potrzebnych do wybudowania całej potrzebnej infrastruktury.</p>

<p>Napisz program, kt&oacute;ry wczyta opis łańcuch&oacute;w g&oacute;rskich i miast w Bajtocji, znajdzie minimalną liczbę ekip budowlanych potrzebnych, aby wybudować drogi tak aby pomiędzy każdą parą miast można było przejechać oraz wypisze liczbę tych ekip.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 100 000) określająca liczbę miast w Bajtocji. W kolejnych N wierszach znajduje się opis wsp&oacute;łrzędnych kolejnych miast: x<sub>i</sub> oraz y<sub>i</sub> (&minus;10<sup>6</sup> &le; x<sub>i</sub>, y<sub>i</sub> &le; 10<sup>6</sup>). Wszystkie wsp&oacute;łrzędne są całkowite. Żadne dwa miasta nie leżą w tym samym punkcie.</p>

<p>W kolejnym wierszu wejścia znajduje się jedna liczba naturalna M (1 &le; M &le; 50) określająca liczbę łańcuch&oacute;w g&oacute;rskich. W kolejnych M wierszach znajduje się opis kolejnych łańcuch&oacute;w (prostych): a<sub>j</sub>, b<sub>j</sub> oraz c<sub>j</sub> (&minus;10<sup>6</sup> &le; a<sub>j</sub>, b<sub>j</sub>, c<sub>j</sub> &le; 10<sup>6</sup>) określających r&oacute;wnanie prostej a<sub>j</sub>x + b<sub>j</sub>y + c<sub>j</sub> = 0. Wszystkie wsp&oacute;łczynniki prostych są całkowite, a r&oacute;wnanie opisuje prawidłową prostą, tj. a<sub>j</sub> &ne; 0 lub b<sub>j</sub> &ne; 0. Dodatkowo żadne dwa r&oacute;wnania nie opisują tej samej prostej.</p>

<p>Gwarantowane jest, że żadne miasto nie leży na żadnym łańcuchu g&oacute;rskim oraz że żadne trzy łańcuchy nie przecinają się w jednym punkcie.</p>

### 출력

<p>Należy wypisać jedną liczbę całkowitą &ndash; minimalną liczbę ekip budowlanych.</p>
# [Gold II] Zalew - 8851

[문제 링크](https://www.acmicpc.net/problem/8851)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 9, 정답: 6, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

그래프 이론, 그래프 탐색, 이분 탐색, 깊이 우선 탐색, 격자 그래프

### 문제 설명

<p><em>Ten Wincenty to dopiero oryginał!</em>&nbsp;- pomyślał pan J&oacute;zef, znany rolnik i hodowca, sąsiad pana Wincentego.&nbsp;<em>Oddał mi spory kawałek swojego ogrodu żeby mieć więcej czasu na rozrywki! Niekt&oacute;rym, to tylko zabawa w głowie, a tu pracować trzeba!&nbsp;</em></p>

<p>Dla pana J&oacute;zefa potrzeba rozrywki jest uczuciem zupełnie obcym. Od lat w pocie czoła buduje dobrobyt swojego gospodarstwa i nie zamierza przestawać. Zupełnie niedawno na przykład postanowił poszerzyć swoją działalność o hodowlę ryb - szczupak&oacute;w i karasi. Wybrał odpowiednie miejsce na staw hodowlany i obmyślił każdy szczeg&oacute;ł budowy. Właśnie otrzymał pocztą pozwolenie na budowę, więc przyszedł czas na przejście do czyn&oacute;w.</p>

<p>Pan J&oacute;zef poszedł do przeznaczonego na staw prostokątnego zagłębienia terenu. Umieścił pompę w najniższym punkcie działki i już miał ją włączyć, kiedy przypadkowo spojrzał na stojącą obok śliwę. Była wprawdzie niemal całkowicie ogołocona z liści, ale było w niej coś, co obiecywało moc owoc&oacute;w wraz z nadejściem kolejnego lata.</p>

<p><em>Żal byłoby zmarnować te drzewa po tylu wsp&oacute;lnie spędzonych latach (i tylu wysokogatunkowych śliwkach - co jeśli podniosą ceny śliwek w skupie?)</em>&nbsp;- Pan J&oacute;zef postanowił tak dobrać ilość wody, żeby żadne drzewo owocowe nie zostało zalane, a staw był jak największy.</p>

<p>Jak duży staw uda mu się w ten spos&oacute;b stworzyć?</p>

<p>(w zadaniu pomijamy stanowisko przer&oacute;żnych urzęd&oacute;w, kt&oacute;rym zapewne nie spodoba się zmiana planu zatwierdzonego w pozwoleniu na budowę)</p>

### 입력

<p>W pierwszej linii wejścia znajdują się dwie liczby naturalne N i M ( 1 &lt;= N,M &lt;= 1000 ) - długość i szerokość działki przeznaczonej na staw. Następnie podawany jest opis N*M p&oacute;l działki w N kolejnych liniach, z kt&oacute;rych każda składa się z M liczb całkowitych o wartości bezwzględnej &lt;= 10000.</p>

<p>Wartość bezwzględna każdej z tych liczb oznacza wysokość działki w odpowiadającym polu. Liczby ujemne oznaczają pola, w kt&oacute;rych rosną drzewa owocowe. Liczba 0 oznacza miejsce, w kt&oacute;rym znajduje się pompa - gwarantujemy, że będzie tylko jedno takie pole. Każde pole działki ma kształt kwadratu o boku długości 1. Pompowana woda rozlewa się zgodnie z prawami grawitacji, przez wsp&oacute;lny bok sąsiadujących p&oacute;l (nigdy przez wsp&oacute;lny r&oacute;g!).</p>

### 출력

<p>Maksymalna powierzchnia stawu pana J&oacute;zefa.</p>
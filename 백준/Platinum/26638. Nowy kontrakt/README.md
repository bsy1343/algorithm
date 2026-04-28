# [Platinum IV] Nowy kontrakt - 26638

[문제 링크](https://www.acmicpc.net/problem/26638)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 3, 맞힌 사람: 3, 정답 비율: 12.500%

### 분류

구현, 그리디 알고리즘, 문자열, 많은 조건 분기

### 문제 설명

<p>Twoja firma, zajmująca się produkcją gier wideo, odniosła oszałamiający sukces &ndash; seria N gier o wędrującym przez Galaktykę pogromcy kwazar&oacute;w sprzedała się znakomicie, przynosząc Ci sławę, pieniądze, a także niespodziewane kłopoty. Oto gruchnęła wieść, że znany pisarz science-fiction, na podstawie kt&oacute;rego książek powstały Twoje gry, uznał właśnie, że prawa do adaptacji sprzedał po zbyt niskiej cenie i przez swoich prawnik&oacute;w domaga się zmiany zapis&oacute;w kontraktu.<sup>&lowast;</sup></p>

<p>Umowa przewidywała, że za udzielenie licencji na grę numer i (gdzie i = 1, 2, . . . , N) pisarz otrzyma wynagrodzenie a<sub>i</sub>, będące pewną liczbą całkowitą dodatnią. Prawnicy argumentują jednak, że skoro każda następna gra sprzedawała się lepiej niż poprzednia, także wynagrodzenie powinno być wyższe. Chcesz uniknąć niepotrzebnego rozgłosu (a także paniki wśr&oacute;d akcjonariuszy), zatem ingerencja w zapis umowy powinna być jak najmniejsza. Zdecydowałeś się zatem do każdej z liczb a<sub>1</sub>, . . . , a<sub>N</sub> dopisać pewną liczbę cyfr na końcu tak, aby otrzymany w ten spos&oacute;b nowy ciąg był ściśle rosnący. Dla każdego a<sub>i</sub> dopisane cyfry (oraz ich liczba) mogą być inne, możesz też niekt&oacute;rych liczb nie zmieniać w og&oacute;le.</p>

<p>Rozstrzygnij, ile minimalnie cyfr musisz w tym celu łącznie dopisać.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita N (1 &le; N &le; 200 000). W kolejnych N wierszach podane są liczby całkowite a<sub>1</sub>, . . . , a<sub>N</sub> (1 &le; a<sub>i</sub> &le; 10<sup>9</sup>).</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na wyjście jedną liczbę całkowitą &ndash; minimalną możliwą liczbę dopisanych cyfr.</p>

### 힌트

<p>Wyjaśnienie do przykładu: Dopisując, odpowiednio, cyfry 7 i 3 do drugiej i trzeciej liczby otrzymamy rosnący ciąg (8, 57, 133). Możliwe są inne rozwiązania, ale nie da się osiągnąć celu przez dopisanie tylko jednej cyfry.</p>
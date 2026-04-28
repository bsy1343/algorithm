# [Silver II] Programy - 26754

[문제 링크](https://www.acmicpc.net/problem/26754)

### 성능 요약

시간 제한: 12 초, 메모리 제한: 1024 MB

### 통계

제출: 51, 정답: 39, 맞힌 사람: 31, 정답 비율: 75.610%

### 분류

그리디 알고리즘, 정렬, 집합과 맵, 두 포인터

### 문제 설명

<p>Bajtazar zmienia właśnie komputer, musi więc przenieść swoje aktualne oprogramowanie ze starego komputera na nowy. Praca jaką wykonuje Bajtazar wymaga od niego szczeg&oacute;lnej dbałości o bezpieczeństwo, dlatego wysyłanie program&oacute;w do chmury czy przez e-mail nie wchodzi w grę. Zamiast tego Bajtazar postanowił użyć ulubionego nośnika &ndash; płyt CD!</p>

<p>Izolacja jest najlepszą metodą bezpieczeństwa, dlatego na każdej płycie Bajtazar zapisze co najwyżej jeden program, niezależnie od tego ile wolnego miejsca miałoby zostać na płycie. Aby wygodnie korzystać z oprogramowania na nowym komputerze Bajtazar postanowił, że nie będzie dzielił program&oacute;w na wiele płyt CD, to znaczy każdy program będzie zapisany w jednym kawałku na co najwyżej jednej płycie.</p>

<p>Każdy program zajmuje odpowiednią ilość miejsca i każda płyta ma też swoją pojemność. Oczywiście aby zapisać program na danej płycie ilość zajmowanego przez niego miejsca nie może być większa od pojemności płyty.</p>

<p>Być może Bajtazar nie zorientował się jeszcze, że może nie być stanie w ten spos&oacute;b przenieść wszystkiego &ndash; oblicz, ile najwięcej program&oacute;w będzie jest w stanie przenieść przestrzegając swoich zasad.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 1 000 000) określająca liczbę program&oacute;w. W drugim wierszu wejścia znajduje się N liczb naturalnych A<sub>i</sub> (1 &le; A<sub>i</sub> &le; 10<sup>9</sup>) pooddzielanych pojedynczymi odstępami oznaczających rozmiary kolejnych program&oacute;w w bajtach.</p>

<p>W trzecim wierszu wejścia znajduje się jedna liczba naturalna M (1 &le; M &le; 1 000 000), określająca liczbę płyt. W czwartym (ostatnim) wierszu wejścia znajduje się ciąg M liczb naturalnych B<sub>i</sub> (1 &le; B<sub>i</sub> &le; 10<sup>9</sup>) pooddzielanych pojedynczymi odstępami oznaczających pojemności kolejnych płyt w bajtach.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na wyjście dokładnie jedną liczbę całkowitą oznaczającą największą możliwą liczbę program&oacute;w, kt&oacute;rą da się przenieść na płytach zgodnie z zasadami Bajtazara.</p>
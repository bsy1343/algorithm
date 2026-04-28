# [Bronze II] Farby - 8727

[문제 링크](https://www.acmicpc.net/problem/8727)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 199, 정답: 93, 맞힌 사람: 73, 정답 비율: 57.031%

### 분류

수학, 구현

### 문제 설명

<p>W ILO zaczęły się generalne porządki. Pani dyrektor postanowiła, że pan konserwator Jarek powinien odświeżyć sale na parterze i pomalować je na jej ulubione kolory.</p>

<p>Na parterze mamy 6 r&oacute;żnych sal. Pani dyrektor chciałaby, aby pierwsza sala została pomalowana na ż&oacute;łto, druga na zielono, trzecia na niebiesko, czwarta na fioletowo, piąta na czerwono, a ostatnia na pomarańczowo.</p>

<p>Pan Jarek przypomniał sobie, że ze starych zapas&oacute;w posiada pewną ilość farby czerwonej, ż&oacute;łtej oraz niebieskiej. Ku zadowoleniu pani dyrektor stwierdził, że trzy kolory wystarczą mu na spełnienie prośby dyrekcji, ponieważ ze szkoły podstawowej pamiętał, że aby otrzymać kolor zielony, wystarczy zmieszać w tych samych ilościach farbę ż&oacute;łtą z niebieską, analogicznie fioletowa powstanie z farby niebieskiej i czerwonej, a pomarańczowa z farby ż&oacute;łtej oraz czerwonej.</p>

<p>Pan Jarek chciałby wiedzieć, ile farby każdego rodzaju (czerwonej, ż&oacute;łtej i niebieskiej) musi dokupić, aby m&oacute;c wymalować wszystkie sale.</p>

### 입력

<p>W pierwszym wierszu podane są trzy liczby całkowite dodatnie <em>c</em>, <em>z</em>&nbsp;oraz <em>n</em>&nbsp;pooddzielane pojedynczymi spacjami: ilość farby czerwonej (0 &lt; <em>c</em> &lt; 10<sup>9</sup>), ilość farby ż&oacute;łtej (0 &lt; <em>z</em> &le; 10<sup>9</sup>), oraz ilość farby niebieskiej (0 &lt; <em>n</em> &le; 10<sup>9</sup>), kt&oacute;rą posiada Pan Jarek. W kolejnych 6 wierszach podane są liczby całkowite dodatnie 0 &lt; <em>p<sub>i</sub></em> &le; 1000, wyrażające ilość litr&oacute;w farby potrzebnych na wymalowanie poszczeg&oacute;lnych sal.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać trzy liczby, oznaczające opdowiednio ilośc farby czerwonej, kt&oacute;rą trzeba dokupić, ilośc farby ż&oacute;łtej, kt&oacute;rą trzeba dokupić, oraz ilość farby niebieskiej, kt&oacute;rą trzeba dokupić, aby m&oacute;c wymalować wszytskie sale (jeśli wynik nie jest liczbą całkowitą, to należy wypisać jedno miejsce po przecinku).</p>
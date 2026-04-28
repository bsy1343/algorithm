# [Bronze I] Klass - 7173

[문제 링크](https://www.acmicpc.net/problem/7173)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 184, 정답: 100, 맞힌 사람: 85, 정답 비율: 52.469%

### 분류

구현, 문자열

### 문제 설명

<p>Klass on t&auml;is &otilde;pilasi, kes istuvad ridade ja veergude kaupa. Iga &otilde;pilane huvitub mingil m&auml;&auml;ral arvutitest ja spordist. &Otilde;pilased, keda huvitab ainult sport, on t&auml;histatud $0$-ga. &Otilde;pilased, keda huvitavad ainult arvutid, on t&auml;histatud $9$-ga. Teised &otilde;pilased on vastavalt oma huvi m&auml;&auml;rale t&auml;histatud arvudega $1$--$8$.</p>

<p>Sarnaste huvidega &otilde;pilased lobisevad omavahel ja ei p&ouml;&ouml;ra &otilde;petaja jutule t&auml;helepanu. Mida v&auml;iksem on kahe naaber&otilde;pilase huvide erinevus, seda rohkem nad lobisevad. Seega, kui meil on n&auml;iteks &otilde;pilane huvidega $7$, keda &uuml;mbritsevad teised &otilde;pilased huvidega $7$, ei pane ta &uuml;ldse &otilde;petajat t&auml;hele.</p>

<p>Iga &otilde;pilase t&auml;helepanu on m&auml;&auml;ratud tema ja tema naabrite huvide erinevuste keskmisega. Naabriteks loetakse &otilde;pilasi, kes istuvad antud &otilde;pilasest vahetult ees, taga, vasakul v&otilde;i paremal.</p>

<p>Kogu klassi t&auml;helepanu m&auml;&auml;r v&otilde;rdub &uuml;ksikute &otilde;pilaste t&auml;helepanude summaga. Kirjutada programm, mis selle leiab.</p>

### 입력

<p>Tekstifaili esimesel real on arvud $M$ ja $N$ ($1 \le M \le 200$, $1 \le N \le 200$), mis n&auml;itavad ridade ja veergude arvu klassis. Klassis on v&auml;hemalt kaks &otilde;pilast. J&auml;rgmisel $M$ real on iga&uuml;hel t&auml;pselt $N$ m&auml;rki $0$ kuni $9$.</p>

### 출력

<p>Tekstifaili v&auml;ljastada &uuml;ks arv: kogu klassi t&auml;helepanu m&auml;&auml;r. V&auml;ljastatud vastus ei tohi t&auml;psest erineda rohkem kui $0{,}0001$ v&otilde;rra.</p>
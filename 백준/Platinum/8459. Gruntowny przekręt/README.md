# [Platinum II] Gruntowny przekręt - 8459

[문제 링크](https://www.acmicpc.net/problem/8459)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 16, 정답: 7, 맞힌 사람: 4, 정답 비율: 50.000%

### 분류

(분류 없음)

### 문제 설명

<p><i>(...) Tak więc opowiadano mi na przykład, że pewien mieszkaniec stolicy, otrzymawszy trzy pokoje z kuchnią na Ziemlanym Wale, bez żadnego tam piątego wymiaru i innych takich rzeczy, od kt&oacute;rych można dostać kołowacizny, w mgnieniu oka przerobił je na cztery pokoje z kuchnią &ndash; jeden pok&oacute;j przedzielił przepierzeniem na p&oacute;ł. Następnie zamienił to mieszkanie na dwa oddzielne mieszkania w r&oacute;żnych dzielnicach Moskwy, jedno trzy, a drugie dwupokojowe. Przyzna pani sama, że to już czyni pięć pokoi. Trzypokojowe zamienił na dwa oddzielne po dwa pokoje z kuchnią i stał się posiadaczem, jak sama pani to widzi, sześciu pokoi, co prawda rozrzuconych chaotycznie po całej Moskwie. Zamierzał właśnie wykonać ostatnią i najbardziej popisową woltę i zamieścił w gazecie ogłoszenie, że chce zamienić sześć pokoi w r&oacute;żnych punktach Moskwy na jedno pięciopokojowe mieszkanie na Ziemlanym Wale, kiedy jego działalność ustała z przyczyn całkowicie od niego niezależnych. Być może, że zajmuje i teraz jakiś pok&oacute;j, mogę panią jednak zapewnić, że nie w Moskwie. Proszę, to się nazywa człowiek z głową na karku, a pani tu opowiada o piątym wymiarze!</i></p>

<p style="text-align: right;"><i>&mdash; Michaił Bułhakow, &bdquo;Mistrz i Małgorzata&rdquo;</i></p>

<p>Bajtazar jest szczęśliwym właścicielem prostokątnej działki, kt&oacute;rą dla cel&oacute;w geodezyjnych podzielił na <em>m</em>&nbsp;&times; <em>n</em>&nbsp;kwadrat&oacute;w jednostkowych. Tak się złożyło, że każdy kwadrat jest albo łąką, albo bagnem. Bajtazar chciałby sprzedać swoją działkę i wyjechać na Karaiby. Ponieważ nie planuje w najbliższym czasie powrotu do Bajtocji, nic nie stoi na przeszkodzie, aby sprzedać ją wielu nabywcom jednocześnie...</p>

<p>Każdy nabywca może kupić pewien prostokątny kawałek działki o bokach pokrywających się z bokami jednostkowych kwadrat&oacute;w. Niestety, nikt nie zaakceptuje obecności w swoim kawałku bagna. Kawałki sprzedane r&oacute;żnym osobom mogą się nakładać, ale żadne dwa nie mogą mieć tego samego prawego dolnego rogu (bajtoccy urzędnicy, choć z lotności nie słyną, to zauważyliby z pewnością). Koszt działki, jak stanowi bajtockie prawo, jest proporcjonalny do jej&nbsp;<b>obwodu</b>. Ile zatem może najwięcej zarobić Bajtazar?</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajduje się liczba test&oacute;w <em>T</em>. Dalej następuje&nbsp;<em>T</em>&nbsp;test&oacute;w, w następującej postaci: Pierwszy wiersz testu zawiera dwie liczby całkowite <em>n</em>&nbsp;i <em>m</em>&nbsp;(1 &le; <em>n</em>, <em>m</em> &le; 2000) oznaczające wysokość i szerokość działki. Dalej następuje&nbsp;<em>n</em>&nbsp;wierszy, z kt&oacute;rych każda zawiera <em>m</em>&nbsp;znak&oacute;w. Znakiem <em>j</em>-tym w <em>i</em>-tym wierszu jest &bdquo;<code>.</code>&rdquo;, jeśli pole o wsp&oacute;łrzędnych (<em>i</em>, <em>j</em>)&nbsp;jest łąką, lub &bdquo;<code>#</code>&rdquo;, jeśli jest bagnem.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na standardowe wyjście, dla każdego zestawu, jedną liczbę całkowitą &mdash; maksymalną sumę obwod&oacute;w działek, kt&oacute;re może sprzedać Bajtazar.</p>
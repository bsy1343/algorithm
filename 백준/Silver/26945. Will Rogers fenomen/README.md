# [Silver V] Will Rogers fenomen - 26945

[문제 링크](https://www.acmicpc.net/problem/26945)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 32, 맞힌 사람: 26, 정답 비율: 66.667%

### 분류

수학, 브루트포스 알고리즘

### 문제 설명

<p>Will Rogers (1879-1935) var en amerikansk komiker k&auml;nd f&ouml;r bland annat f&ouml;ljande citat:</p>

<p><em>&quot;When the Okies left Oklahoma and moved to California, they raised the average intelligence level in both states.&quot;</em></p>

<p>Denna skenbara paradox, att flyttning av ett element fr&aring;n en m&auml;ngd till en annan g&ouml;r att medelv&auml;rdet &ouml;kar i b&aring;da m&auml;ngderna, har d&auml;rf&ouml;r f&aring;tt namnet Will Rogers fenomen. Du ska skriva ett program som l&auml;ser in tv&aring; grupper A och B vardera best&aring;ende av minst tv&aring; och h&ouml;gst tio positiva heltal och avg&ouml;r huruvida det &auml;r m&ouml;jligt att genom att flytta ett tal fr&aring;n den ena gruppen till den andra f&aring; medelv&auml;rdet att &ouml;ka i b&aring;da grupperna och i s&aring; fall vilket tal som ska flyttas till vilken grupp.</p>

### 입력

<p>Den f&ouml;rsta raden best&aring;r av tv&aring; tal: antal tal i f&ouml;rsta gruppen, och antal tal i andra gruppen (b&aring;da mellan 1 och 10). D&auml;refter f&ouml;ljer en rad med talen i f&ouml;rsta gruppen, och en rad med talen i andra gruppen.</p>

<p>Alla tal kommer att vara mellan $1$ och $20$.</p>

### 출력

<p>Om det &auml;r m&ouml;jligt att flytta ett tal fr&aring;n ena gruppen till andra f&ouml;r att &ouml;ka medelv&auml;rdet i b&aring;da, skriv ut en rad med talet som ska flyttas och vilken grupp det ska flyttas till. Om det finns flera m&ouml;jligheter s&aring; r&auml;cker det att skriva ut en av dem.</p>

<p>Om det inte &auml;r m&ouml;jligt, skriv ut <code>NEJ</code>.</p>

### 힌트

<p>I det f&ouml;rsta exemplet &auml;r medelv&auml;rdena $2$ respektive $4$ innan flyttning. Efter att talet $3$ flyttats &ouml;ver fr&aring;n B till A &auml;r medelv&auml;rdena $2.25$ respektive $4.333\ldots$.</p>

<p>I det andra exemplet kan fenomenet inte uppkomma. Om man t.ex. flyttar talet $5$ fr&aring;n A till B s&aring; &ouml;kar visserligen medelv&auml;rdet i grupp A men medelv&auml;rdet i grupp B f&ouml;rblir of&ouml;r&auml;ndrat.</p>
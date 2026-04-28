# [Gold III] Equidistance - 6570

[문제 링크](https://www.acmicpc.net/problem/6570)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 9, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

기하학, 3차원 기하학

### 문제 설명

<p>Alice and Bob haven&#39;t met for some time. Bob isn&#39;t very happy about this, so he urges Alice to finally make time for a meeting. Let&#39;s listen to an extract from a phone call:</p>

<p><em>Alice:</em> ... maybe we should meet on neutral territory.</p>

<p><em>Bob:</em> I&#39;ve already heard this from you --- two years ago.</p>

<p><em>Alice:</em> I know ; I just haven&#39;t found yet a suitable place that is roughly at the same distance from both yours and mine.</p>

<p><em>Bob:</em> Well, the geometric place of the points that are equidistant from two given points on the surface of a sphere (and the earth is a sphere rather than a disc) is a great circle (namely the one which intersects the great circle through the given points orthogonally at the center of them). If you insist only on approximately equal distances though, we get a zone of some kilometers width and about 40000 km length. Not everything in this zone is water. Thus I think it is a feasible task to find a fitting place.</p>

<p><em>Alice:</em> Now, if I tell you to pick any, we&#39;ll certainly land up in Honolulu.</p>

<p><em>Bob:</em> Which is not a too bad idea. So, may I pick any ?</p>

<p><em>Alice:</em> As long as I don&#39;t have to accept --- but I&#39;m open to suggestions.</p>

<p><em>Bob:</em> Honolulu ?</p>

<p><em>Alice:</em> Is it situated on aforementioned geometric place at all ??!</p>

<p><em>Bob:</em> Not quite ...</p>

<p>Nice. Now let&#39;s stop the preliminaries and come to the facts: Given two locations on the earth&#39;s surface you can find the geometric place of all equidistant points on the surface. For another given location calculate its distance on the surface to this geometric place. Assume that the earth is a sphere with a radius of <em>6378</em> km.</p>

### 입력

<p>The input file consists of two parts: a list of locations and a list of queries.</p>

<p>The location list consists of up to 100 lines, one line per location. Each contains a string and two floating-point numbers, separated by whitespace, representing the name of the location, its latitude and its longitude. Names are unique and shorter than 30 characters and do not contain whitespace. Latitudes are between <em>-90</em> (South Pole) and <em>90</em> (North Pole) inclusive. Longitudes are between <em>-180</em> and <em>180</em> inclusive where negative numbers denote locations west of the meridian and positive numbers denote locations east of the meridian. (The meridian passes through Greenwich, London.) The location list is terminated by a line consisting of a single &quot;#&quot;.</p>

<p>Each line in the query list contains three names of locations. You can assume the first location to be Alice&#39;s home, the second location to be Bob&#39;s home and the third location to be a possible meeting point. The query list is terminated by a line consisting of a single &quot;#&quot;.</p>

### 출력

<p>For each query, output a line saying &quot;<em>M</em> is <em>x</em> km off <em>A</em>/<em>B</em> equidistance.&quot; with <em>M,x,A,B</em> appropriately replaced by the location names and the calculated distance rounded to the nearest integer.</p>

<p>If one of the locations in the query didn&#39;t occur in the list of locations print &quot;?&quot; instead of the distance.</p>
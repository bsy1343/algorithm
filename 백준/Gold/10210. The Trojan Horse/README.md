# [Gold V] The Trojan Horse - 10210

[문제 링크](https://www.acmicpc.net/problem/10210)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 61, 정답: 36, 맞힌 사람: 33, 정답 비율: 67.347%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 플러드 필

### 문제 설명

<p>The Trojan War between Athens and Troy was started by Paris abducting Helen of Troy, the most beautiful woman on Earth. After a 10-year war and siege, the Greeks pretended to sail away in &ldquo;defeat&rdquo;, having constructed and left a large wooden horse as a &ldquo;gift&rdquo; to the Trojans. The Trojans hauled the horse into their city, ignoring their priest Laoco&uml;on&rsquo;s warning: &ldquo;Trojans, don&rsquo;t trust this horse. Whatever it is, I am afraid of Greeks, even those bearing gifts.&rdquo; Of course, the horse contained a few select Greek soldiers, who opened the city&rsquo;s doors and let the army enter and slaughter the Trojans.<sup>5</sup></p>

<p>In this problem, we will do what the Trojans should have done: check to make sure there are no soldiers hidden inside the horse. Of course, it is not quite as simple as looking inside, since the horse may have a pretty complicated structure, so we assume that several Trojan soldiers walked through the horse. However, there may be some places they cannot reach, because they are behind wooden walls. So they need to infer if those cavities (which, for all they know, have secret doors) are large enough to contain any soldiers.</p>

<p>You will be given the patrol routes through the horse of the Trojan soldiers. You will be asked to figure out if in the uninspected region, there are areas large enough for a Greek soldier. We assume that Greek soldiers are very flexible, so they can bend their bodies into any shape so long there is enough space to fit.</p>

<p><sup>5</sup>One may question why at USC we are proudly named after a people stupid enough to haul a huge container originating with their enemies into their city unchecked.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line contains four integers h, w, s, n, separated by spaces. 1 &le; h &le; 30 and 1 &le; w &le; 30 are the height and width of the Trojan horse map (which will be just a rectangle). 1 &le; s &le; hw is the size of a Greek soldier, and 1 &le; n &le; 100 is the number of Trojan soldiers who patrolled the horse.</p>

<p>This is followed by n lines, each describing the route of one Trojan soldier. The route is described as a string of at most 100 characters, each a lower-case letter &lsquo;l&rsquo;, &lsquo;r&rsquo;, &lsquo;u&rsquo;, or &lsquo;d&rsquo;. These designate that the soldier walked left, right, up, or down on the map. The soldier always starts at the bottom left of the map, and all routes will be such that the soldier never leaves the map.</p>

<p>A cavity is an area of the horse that is connected by going up, down, left, or right, and that has not been patrolled by any soldier.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number.</p>

<p>Then, output on a line by itself the number of distinct cavities that are large enough to fit (at least) one Greek soldier.</p>

<p>Each data set should be followed by a blank line.</p>
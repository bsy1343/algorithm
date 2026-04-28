# [Platinum IV] Cables ... in Spaaace! - 4526

[문제 링크](https://www.acmicpc.net/problem/4526)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 1, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

그래프 이론, 기하학, 최소 스패닝 트리, 3차원 기하학

### 문제 설명

<p>Many science fiction stories take place on distant planets in galaxies far, far, away. Some of the best writers will spend time researching the relevant scientific fields of today to make their futuristic technology seem believable to a modern day audience. As a budding young writer participating in the National Novel Writing Month (NaNoWriMo) in November, you&#39;d like to do some technological research as well to make sure your own SF universe is up to par.</p>

<p>In your own SF novel, humanity has spread out throughout the galaxy and has come to colonize many a planet. Aside from the obvious requirement of interstellar space flight in your book, you&#39;d like to keep all other technologies, computers especially, similar to what is available in today&#39;s world. That means the computer networks on many of the colonized planets will still be designed by running copper or fiber optic cable between the computers.</p>

<p>Modern computer networks use packet switching which means that you do not have to physically run a separate cable between every pair of computers. It&#39;s enough that the computer network remains strongly connected. In other words, it&#39;s enough that for every pair of computers on the network, some path exists such that packets traveling to and fro between the computers can reach their destinations by being forwarded through any number of computers in-between.</p>

<p>This property of packet switching allows us to minimize how much cable has to be laid down to allow every computer on the network to communicate with every other. As a budding SF writer, you&#39;d like to know the absolute minimum total length of cable that would be required to create a computer network between all the cities on your newly colonized planet, assuming there are no redundant or aggregate links in the network. When performing your calculations, you may assume that the planet is a perfect sphere, all the cables are run along the surface of the planet, and that no surface obstructions (like rivers or mountain ranges) exist to impede the run of cable.</p>

<p>The input to this problem will specify the diameter of the planet in question, and it will include a list of city coordinates given in degrees of latitude and longitude. For those who are not as cartographically savvy as they&#39;d like, latitude is an angular measurement ranging from &minus;90&deg; at the South pole to +90&deg; at the North pole and with 0&deg; located at a planet&#39;s equator. Longitude is an angular measurement ranging between &minus;180&deg; and +180&deg; with 0&deg; specifying the prime meridian. By convention negative longitude represents locations to the West of the prime meridian, and positive longitude presents locations to the East.</p>

### 입력

<p>Input to this problem will begin with a line containing a single integer N (1 &le; N &le; 100) indicating the number of data sets. Each data set consists of the following components:</p>

<ul>
	<li>A line containing a single decimal number D (1 &le; D &le; 1,000,000) specifying the diameter (in kilometers) of the planet in question.</li>
	<li>A line containing a single decimal number L (1 &le; L &le; 1,000,000) giving the total length of cable (in kilometers) available for building a network on the newly colonized planet.</li>
	<li>A line containing a single integer C (1 &le; C &le; 100) indicating the number of cities this planet contains.</li>
	<li>A series of C lines, each of which contains two decimal numbers of the form &quot;X Y&quot; respectively specifying the latitude and longitude (both in degrees) of one city with (&minus;90 &le; X &le; 90) and (&minus;180 &le; X &le; 180).</li>
</ul>

### 출력

<p>For each data set in the input, print a single line. Print either &quot;IS POSSIBLE&quot; if the available length of cable L is enough to network all the cities, or print &quot;IS NOT POSSIBLE&quot; if the available length of cable L is too short.</p>
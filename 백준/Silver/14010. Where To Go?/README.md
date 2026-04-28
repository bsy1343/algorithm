# [Silver III] Where To Go? - 14010

[문제 링크](https://www.acmicpc.net/problem/14010)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 66, 정답: 46, 맞힌 사람: 44, 정답 비율: 70.968%

### 분류

구현, 문자열, 브루트포스 알고리즘

### 문제 설명

<p><strong><a href="https://en.wikipedia.org/wiki/RioCard" target="_blank">RioCard</a>&nbsp;only works in Rio??</strong>&nbsp;- Dudu, 2014</p>

<p>Dudu doesn&#39;t know any Thai, so before traveling to&nbsp;<a href="https://en.wikipedia.org/wiki/Bangkok" target="_blank">Bangkok, Thailand</a>&nbsp;from his hometown of&nbsp;<a href="https://en.wikipedia.org/wiki/Rio_de_Janeiro" target="_blank">Rio de Janeiro, Brazil</a>&nbsp;he prepared a paper with some common sentences.</p>

<p>Most of the sentences were normal small talk conversations, like: &quot;s&agrave;-w&agrave;t-dee&quot; (Hello), &quot;pŏm ch&ecirc;u Dudu&quot; (My name is Dudu), and &quot;hoh wer-kr&acirc;af kŏng pŏm dtem-bpai-d&ucirc;ay bplaa lăi&quot; (My hovercraft is full of eels).</p>

<p>He also prepared a sentence where it was written in Thai:&nbsp;<strong>&quot;Help me, I am a tourist and I don&#39;t speak Thai. Please let me know what train I should take to go to the Lumphini subway station.&quot;</strong></p>

<p>When he arrived there he got really surprised; both because he couldn&#39;t use his RioCard, and because they don&#39;t use Latin Characters to write, so &quot;Hello&quot; would actually be written as สวัสดี.</p>

<p>At one point he got lost and wanted to go back to the hotel. He pulled out his big &quot;help me&quot; note and thought: &quot;somewhere in this note there is the name of my station. Maybe I can figure out how to write it in Thai using the list of all stations.&quot;</p>

<p>For example, if his station in latin characters is &quot;ABLA,&quot; he knows that in Thai characters it will be a four-letter word with the first and the fourth being the same. Can you help Dudu finding his station?</p>

### 입력

<p>The first line of input will contain an integer N with the number of stations in the subway system.</p>

<p>The second line will contain a string s with the sentence Dudu had prepared.</p>

<p>The following N lines will contain the names of the stations, one per line.</p>

<ul>
	<li>1 &le; N &le; 1000</li>
	<li>1 &le; |s| &le; 1000</li>
</ul>

<p>Each station name will not be empty, and the sum of the sizes of all names of stations will not be greater than 1000.</p>

<p>s will consist entirely of upper case letters. All station names will consist entirely of lower case Latin letters (which will represent Thai characters).</p>

### 출력

<p>Output N lines, one for each station name.</p>

<p>On the i-th line, output a single dash in case that station name cannot be in s. Otherwise output a single number with the first position in s where the station name could appear.</p>

<p>See the sample below for a complete example.</p>

### 힌트

<p>The first station name is a single letter, so it can match anywhere. Since we want the first index where it matches, the correct answer is 0.</p>

<p>The second station name is a single letter repeated twice. There are no repeated letters in the input, so it can&#39;t be in s.</p>

<p>The third station can be matched with ABCBA which starts at index 1.</p>

<p>The fourth station can be matched with BCBC which starts at index 6.</p>

<p>The fifth station is a name with 5 different letters. This can&#39;t be matched.</p>

<p>Note that the first letter of s is indexed by 0.</p>
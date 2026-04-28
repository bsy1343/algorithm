# [Gold IV] The Writer's Club - 4916

[문제 링크](https://www.acmicpc.net/problem/4916)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 20, 정답: 8, 맞힌 사람: 5, 정답 비율: 31.250%

### 분류

구현, 그래프 이론, 자료 구조, 그래프 탐색, 집합과 맵, 너비 우선 탐색, 깊이 우선 탐색, 해시를 사용한 집합과 맵

### 문제 설명

<p>Forget Facebook, forget Second Life, The Writers&rsquo; Club is the next big thing on the Internet. The Writers&rsquo; Club is where both writers and lovers of short stories get to meet, publish, read, and discuss the writers&rsquo; promising contributions. As any other Internet virtual community, the website gives readers the facility to create a list of their favorite writers. The website maintainers have noticed that readers tend to favor writers already favored by the readers&rsquo; favorite writers. For example, if John likes the stories written by Alice, then many of the readers who likes John&rsquo;s stories also like Alice&rsquo;s. Needless to say, John&rsquo;s readers tend to also admire Alice&rsquo;s favorite writers too.</p>

<p>The website would like to start a recommendation service based on this observation. Continuing with the above example, the website would like to recommend Alice (and her favorite writers, and their favorite writers, and so on) to all of John&rsquo;s readers. Of course, the recommendation service has to be smart enough not to recommend a writer already favored by the reader receiving the recommendation.</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of a test case specifies two positive integers: T and N where T is the total number of users (not exceeding 100,000) and N is the number of writers (not exceeding 100.) N line follows, one for each writer. Each line is made of one or more names, the first being the name of a writer, and the remaining being the names of admirers of that writer. For example:</p>

<p>writer reader<sub>1</sub> reader<sub>2</sub> . . . reader<sub>d</sub></p>

<p>Where writer is the writer&rsquo;s name, reader<sub>1</sub> ...reader<sub>d</sub> are the names of the writer&rsquo;s admirers. A name is a sequence of one or more lower-case letters, no longer than 16 characters. Names are unique throughout the test case. Names are separated by one or more spaces.</p>

<p>The last line of the input file is made of two zero&rsquo;s.</p>

### 출력

<p>For each test case, the first line of the output should be:</p>

<p>---␣CASE␣k</p>

<p>Where k is the test case number (starting at 1,) and &rsquo;-&rsquo; is the minus sign.<br />
Following that, there should be zero or more lines, one line for each writer being recommended.</p>

<p>The format is:</p>

<p>&nbsp; &nbsp; &nbsp;writer␣reader1␣reader2␣...</p>

<p>Where writer is the name of the writer to be recommended for reader<sub>1</sub>, reader<sub>2</sub>, and so on. The output lines should be sorted alphabetically according to writers, and for each writer, readers should also be sorted alphabetically. No writer should be recommended for himself. All names in the output are separated by a single space.</p>
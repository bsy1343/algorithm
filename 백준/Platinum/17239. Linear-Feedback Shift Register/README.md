# [Platinum III] Linear-Feedback Shift Register - 17239

[문제 링크](https://www.acmicpc.net/problem/17239)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 256 MB

### 통계

제출: 22, 정답: 6, 맞힌 사람: 6, 정답 비율: 50.000%

### 분류

가우스 소거법, 선형대수학, 수학

### 문제 설명

<p>LFSR(Linear-Feedback Shift Register)에 대해서 알고 있는가? LFSR는 의사 난수 값을 생성하는 데 쓰이기도 한다. 이에 대해서 자세히 공부하는 것은 생략하도록 하고, 대신 문제에서는 수식으로 간단하게 정의를 하고자 한다. 문제의 LFSR은 36-bit LFSR이다.</p>

<p>초기값 <em>r</em><sub>0</sub> &sim; <em>r</em><sub>35</sub>(<em>r</em><sub>i</sub> = 0 or 1)와, 다음 Output이 어떤 값들의 XOR로 이루어지는지 정의하는 값 <em>a</em><sub>0</sub> &sim; <em>a</em><sub>35</sub>(<em>a</em><sub>i</sub> = 0 or 1)로 정의된다. LFSR의 Output들은 <em>r</em><sub>36</sub> 부터의 <em>r</em> 값들이다. <em>r</em><sub>36</sub> 이후의 <em>r</em> 값들은 다음과 같이 정의된다: (k는 0 이상의 정수)</p>

<p style="text-align: center;"><em>r</em><sub>k+36</sub> = (<em>a</em><sub>35</sub> &middot; <em>r</em><sub>k+35</sub>) &otimes; (<em>a</em><sub>34</sub> &middot; <em>r</em><sub>k+34</sub>) &otimes; ... &otimes; (<em>a</em><sub>0</sub> &middot; <em>r</em><sub>k</sub>)</p>

<p>(Bitwise AND는 &middot;, Bitwise XOR은 &otimes;로 표기했다.)</p>

<p>이 문제에서 묻고 싶은 것은 <em>a</em><sub>0</sub> &sim; <em>a</em><sub>35</sub>이 주어져 있을 때 <em>N</em>개의 Output들, 즉 <em>r</em><sub>36</sub>부터 <em>r</em><sub>35+N</sub> 까지의 값들을 보고 이를 만족하는 초기값 <em>r</em><sub>0</sub> &sim; <em>r</em><sub>35</sub>이 있는지 답하는 것이다.</p>

### 입력

<p>첫 번째 줄에 <em>a</em><sub>0</sub> &sim; <em>a</em><sub>35</sub>가 띄어쓰기를 사이에 두고 주어진다.</p>

<p>두 번째 줄에 입력으로 들어올 Output의 개수 <em>N</em>(1 &le; <em>N</em> &le; 64)이 주어진다.</p>

<p>세 번째 줄에 <em>r</em><sub>36</sub> &sim; <em>r</em><sub>35+N</sub> 이 띄어쓰기를 사이에 두고 주어진다.</p>

### 출력

<p>첫 번째 줄에 가능한 <em>r</em><sub>0</sub> &sim; <em>r</em><sub>35</sub>가 존재하는지의 여부를 <code>YES</code> 혹은 <code>NO</code>로 출력한다. <code>YES</code>라면 두 번째 줄에 가능한 <em>r</em><sub>0</sub> &sim;&nbsp;<em>r</em><sub>35</sub> 조합 중 <em>r</em><sub>0</sub><em>r</em><sub>1</sub><em>r</em><sub>2</sub>...<em>r</em><sub>35</sub>가 사전순으로 가장 빠른 조합을 <em>r</em><sub>0</sub>, <em>r</em><sub>1</sub>, ... , <em>r</em><sub>35</sub> 순서대로 띄어쓰기를 사이에 두고 출력한다. 000...000이 가장 사전 순으로 빠르며, 111...111이 가장 사전 순으로 느리다.</p>

### 힌트

<p>첫 번째 예제는 <em>r</em><sub>36</sub> = <em>r</em><sub>35&nbsp;</sub>&otimes; <em>r</em><sub>34&nbsp;</sub>&otimes; <em>r</em><sub>33</sub> = 1, <em>r</em><sub>37</sub> = <em>r</em><sub>36&nbsp;</sub>&otimes; <em>r</em><sub>35&nbsp;</sub>&otimes; <em>r</em><sub>34</sub> = 0, <em>r</em><sub>38</sub> = <em>r</em><sub>37&nbsp;</sub>&otimes; <em>r</em><sub>36&nbsp;</sub>&otimes; <em>r</em><sub>35</sub> = 1로 풀어서 쓸 수 있다. 이를 만족하는 <em>r</em><sub>33</sub>, <em>r</em><sub>34</sub>, <em>r</em><sub>35</sub>는 0, 1, 0 뿐이다. <em>r</em><sub>0</sub> &sim;<em>r</em><sub>32</sub>은 어떠한 값이 와도 상관 없다. 그러나 이 중 사전순으로 가장 빠르려면 <em>r</em><sub>0</sub>, <em>r</em><sub>1</sub>, ... , <em>r</em><sub>32</sub> = 0이여야 한다.</p>

<p>두 번째 예제는 모든 <em>a</em><sub>i</sub> 값이 0이기 때문에 가능한 Output은 0뿐이다. 그러나 1이 왔으므로 답은 NO이다.</p>
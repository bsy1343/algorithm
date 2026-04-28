# [Bronze III] A+B - 10 (제1편) - 30917

[문제 링크](https://www.acmicpc.net/problem/30917)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 2406, 정답: 1442, 맞힌 사람: 1238, 정답 비율: 61.838%

### 분류

수학, 구현, 브루트포스 알고리즘, 사칙연산

### 문제 설명

<p>1 이상 9 이하의 정수 A, B에 대해 A+B의 값을 출력해야 한다. 단, 이 문제는 <strong>인터랙티브 (상호작용)</strong> 문제이다. 이 문제에서는 A와 B의 값이 바로 주어지지 않고, 채점기와의 상호작용을 통해 그 값을 알아내야 한다.</p>

### 입력



### 출력

<p>여러분은 채점기에게 <strong>최대 18번</strong> 질문할 수 있다. 질문의 형태는 다음 중 하나이다.</p>

<ul>
	<li><code>? A x</code> - A의 값이 x인지 물어본다.</li>
	<li><code>? B x</code> - B의 값이 x인지 물어본다.</li>
</ul>

<p>예를 들어 A의 값이 4인지 물어보려면 <code>? A 4</code>를 출력하면 된다. 이때 x는 1 이상 9 이하의 정수여야 한다.</p>

<p>질문을 출력한 뒤 실제로 질문을 채점기에게 보내려면 <strong>표준 출력을 flush</strong>해야 한다. 자세한 내용은 아래의 <strong>노트</strong> 란을 참조하자.</p>

<p>질문을 보낸 뒤에는 채점기로부터 정수 하나를 입력받는다. 그 수는 질문의 답이 &quot;예&quot;인 경우 1, &quot;아니요&quot;인 경우 0이다.</p>

<p>A와 B의 값을 알아냈으면 A+B를 계산하여 다음과 같은 형태로 출력한다.</p>

<ul>
	<li><code>! x</code> - A+B의 값은 x이다.</li>
</ul>

<p>예를 들어 A+B가 10인 경우 <code>! 10</code>을 출력하면 된다. 이는 질문 횟수에 포함되지 않는다.</p>

<p>아래의 &quot;노트&quot; 란에 여러 언어에 대한 예시 코드가 작성되어 있다. 단, 완성되지 않은 코드이므로 빈 공간은 직접 채워 넣어야 한다.</p>

### 힌트

<p>상호작용 문제는 채점 방식이 복잡하기 때문에, 문제에 주어진 규약을 지키지 않았을 때 &quot;틀렸습니다&quot;가 아닌 다른 결과가 나올 수도 있음에 유의하자.</p>

<p><strong>예시 코드</strong></p>

<p>C</p>

<pre>
<code>#include &lt;stdio.h&gt;
int main() {
    int resp;
    for(int a=1; a&lt;=9; a++){
        // A가 a인지 물어보고 flush를 한다.
        printf(&quot;? A %d\n&quot;, a); 
        fflush(stdout);

        // 채점기의 답변을 입력받는다.
        scanf(&quot;%d&quot;, &amp;resp);

        if(resp == 1){
            // 답변이 &quot;예&quot;이므로 A의 값은 a이다.
            // B의 값도 알아내야 하는데, 이 부분은 직접 채워보자.
            int b = 0;
            printf(&quot;! %d&quot;, a + b);
            break;
        }
    }
}</code>
</pre>

<p>C++</p>

<pre>
<code>#include &lt;iostream&gt;
int main() {
    int resp;
    for(int a=1; a&lt;=9; a++){
        // A가 a인지 물어보고 flush를 한다.
        // endl은 자동으로 flush도 해준다.
        std::cout &lt;&lt; &quot;? A &quot; &lt;&lt; a &lt;&lt; std::endl;

        // 채점기의 답변을 입력받는다.
        std::cin &gt;&gt; resp;

        if(resp == 1){
            // 답변이 &quot;예&quot;이므로 A의 값은 a이다.
            // B의 값도 알아내야 하는데, 이 부분은 직접 채워보자.
            int b = 0;
            std::cout &lt;&lt; &quot;! &quot; &lt;&lt; a + b;
            break;
        }
    }
}
</code></pre>

<p>Python</p>

<pre>
<code>for a in range(1, 10):
    # A가 a인지 물어보고 flush를 한다.
    # print에 flush 파라미터를 넣으면 된다.
    print(&quot;? A&quot;, a, flush=True)

    # 채점기의 답변을 입력받는다.
    resp = int(input())

    if resp == 1:
        # 답변이 &quot;예&quot;이므로 A의 값은 a이다.
        # B의 값도 알아내야 하는데, 이 부분은 직접 채워보자.
        b = 0
        print(&quot;!&quot;, a + b)
        break</code>
</pre>

<p>Rust</p>

<pre>
<code>fn read_i32() -&gt; i32 {
    let mut resp_s = String::new();
    std::io::stdin().read_line(&amp;mut resp_s).unwrap();
    resp_s.trim().parse().unwrap()
}

fn main() {
    for a in 1..=9 {
        // A가 a인지 물어보고 flush를 한다.
        // println!은 자동으로 flush도 해준다.
        println!(&quot;? A {a}&quot;);

        // 채점기의 답변을 입력받는다.
        let resp = read_i32();

        if resp == 1 {
            // 답변이 &quot;예&quot;이므로 A의 값은 a이다.
            // B의 값도 알아내야 하는데, 이 부분은 직접 채워보자.
            let b = 0;
            println!(&quot;! {}&quot;, a + b);
            break;
        }
    }
}</code>
</pre>

<p>Java</p>

<pre>
<code>import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        for(int a=1; a&lt;=9; a++){
            // A가 a인지 물어보고 flush를 한다.
            // System.out.println은 자동으로 flush도 해준다.
            System.out.println(&quot;? A &quot; + a);

            // 채점기의 답변을 입력받는다.
            int resp = sc.nextInt();

            if(resp == 1){
                // 답변이 &quot;예&quot;이므로 A의 값은 a이다.
                // B의 값도 알아내야 하는데, 이 부분은 직접 채워보자.
                int b = 0;
                System.out.println(&quot;! &quot; + (a + b));
                break;
            }
        }
    }
}</code>
</pre>

<p><strong>표준 출력을 flush해야 하는 이유</strong></p>

<p>콘솔 혹은 파일 입출력은 사칙연산이나 값을 대입하는 등의 기본적인 연산에 비해 상대적으로 느린 작업이다. 따라서 많은 프로그래밍 언어의 기본 출력 기능은 출력을 요청받은 값들을 한 공간에 쌓아두고, 적당한 때에 한꺼번에 출력되도록 한다. 이 공간을 버퍼(buffer)라고 부른다.</p>

<p>그러나 이 문제에서는 채점기가 프로그램의 출력을 실시간으로 확인해야 답변을 줄 수 있다. 따라서 버퍼를 직접 비우는 작업이 필요하고, 이 작업을 flush라고 한다.</p>

<p><strong>예고편</strong></p>

<p><a href="/problem/30924">제2편</a>에서는 &quot;적응하는 채점기&quot;와 &quot;적응하지 않는 채점기&quot;의 차이를 다룬다. 제1편에 비해 어렵다는 점을 유의하자.</p>

<p>이 문제의 채점기는 적응하지 않는다.</p>
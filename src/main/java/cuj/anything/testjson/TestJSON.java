package cuj.anything.testjson;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cujamin on 2017/12/26.
 */
public class TestJSON {
    public static void main(String[] args) {
        String resoure = "Server\n" +
                "redis_version:4.0.6\n" +
                "redis_git_sha1:00000000\n" +
                "redis_git_dirty:0\n" +
                "redis_build_id:f1060815dd32471a\n" +
                "redis_mode:standalone\n" +
                "os:Linux 4.10.0-42-generic x86_64\n" +
                "arch_bits:64\n" +
                "multiplexing_api:epoll\n" +
                "atomicvar_api:atomic-builtin\n" +
                "gcc_version:4.9.2\n" +
                "process_id:8\n" +
                "run_id:16fad684017337a1e0a5468d7869c6f7c1dbd6e4\n" +
                "tcp_port:6379\n" +
                "uptime_in_seconds:3881\n" +
                "uptime_in_days:0\n" +
                "hz:10\n" +
                "lru_clock:4335378\n" +
                "executable:/usr/local/bin/redis-server\n" +
                "config_file:/usr/local/bin/redis_master.conf\n" +
                "\n" +
                "# Clients\n" +
                "connected_clients:3\n" +
                "client_longest_output_list:0\n" +
                "client_biggest_input_buf:0\n" +
                "blocked_clients:0\n" +
                "\n" +
                "# Memory\n" +
                "used_memory:1939064\n" +
                "used_memory_human:1.85M\n" +
                "used_memory_rss:11456512\n" +
                "used_memory_rss_human:10.93M\n" +
                "used_memory_peak:2000864\n" +
                "used_memory_peak_human:1.91M\n" +
                "used_memory_peak_perc:96.91%\n" +
                "used_memory_overhead:1914452\n" +
                "used_memory_startup:765672\n" +
                "used_memory_dataset:24612\n" +
                "used_memory_dataset_perc:2.10%\n" +
                "total_system_memory:4141428736\n" +
                "total_system_memory_human:3.86G\n" +
                "used_memory_lua:37888\n" +
                "used_memory_lua_human:37.00K\n" +
                "maxmemory:0\n" +
                "maxmemory_human:0B\n" +
                "maxmemory_policy:noeviction\n" +
                "mem_fragmentation_ratio:5.91\n" +
                "mem_allocator:jemalloc-4.0.3\n" +
                "active_defrag_running:0\n" +
                "lazyfree_pending_objects:0\n" +
                "\n" +
                "# Persistence\n" +
                "loading:0\n" +
                "rdb_changes_since_last_save:0\n" +
                "rdb_bgsave_in_progress:0\n" +
                "rdb_last_save_time:1514281058\n" +
                "rdb_last_bgsave_status:ok\n" +
                "rdb_last_bgsave_time_sec:0\n" +
                "rdb_current_bgsave_time_sec:-1\n" +
                "rdb_last_cow_size:6475776\n" +
                "aof_enabled:1\n" +
                "aof_rewrite_in_progress:0\n" +
                "aof_rewrite_scheduled:0\n" +
                "aof_last_rewrite_time_sec:-1\n" +
                "aof_current_rewrite_time_sec:-1\n" +
                "aof_last_bgrewrite_status:ok\n" +
                "aof_last_write_status:ok\n" +
                "aof_last_cow_size:0\n" +
                "aof_current_size:0\n" +
                "aof_base_size:0\n" +
                "aof_pending_rewrite:0\n" +
                "aof_buffer_length:0\n" +
                "aof_rewrite_buffer_length:0\n" +
                "aof_pending_bio_fsync:0\n" +
                "aof_delayed_fsync:0\n" +
                "\n" +
                "# Stats\n" +
                "total_connections_received:24\n" +
                "total_commands_processed:8145\n" +
                "instantaneous_ops_per_sec:2\n" +
                "total_net_input_bytes:386310\n" +
                "total_net_output_bytes:1398308\n" +
                "instantaneous_input_kbps:0.13\n" +
                "instantaneous_output_kbps:0.18\n" +
                "rejected_connections:0\n" +
                "sync_full:1\n" +
                "sync_partial_ok:4\n" +
                "sync_partial_err:0\n" +
                "expired_keys:0\n" +
                "evicted_keys:0\n" +
                "keyspa";
        Map<String ,String> map = new HashMap<String,String>();
        String[] resources = resoure.split("\n");
        System.out.println("resources.length"+resources.length);
        for(String s:resources)
        {
            s=s.trim();
            if(s.length()>0&&s.charAt(0)!='#')
            {
                String[] kv = s.split(":");
                if(kv.length==2)
                {
                    map.put(kv[0],kv[1]);
                }
            }
        }
        System.out.println(map.toString());
        System.out.println("map saize:"+map.size());
//        for(String key:map.keySet())
//        {
//            System.out.println("key : "+key+" ; value : "+map.get(key));
//        }
        String json = JSON.toJSONString(map);
        System.out.println(json);
    }
}

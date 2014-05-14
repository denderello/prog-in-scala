class tmux {
  package { 'tmux':
    ensure  => installed
  }
    
  file { '/etc/tmux.conf':
    ensure => file,
    owner  => 'root',
    group  => 'root',
    mode   => '0644',
    source => 'puppet:///modules/tmux/tmux.conf'
  }
}